package py.edu.ucsa.backend.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import py.edu.ucsa.backend.dto.request.ContactoRequest;
import py.edu.ucsa.backend.dto.response.ContactoResponse;
import py.edu.ucsa.backend.service.ContactoService;

@RestController
@RequestMapping("/api/v1/backend/contactos")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoSrv;
	
	private static final Logger logger = LoggerFactory.getLogger(ContactoController.class);
	
	@PostMapping
	public ResponseEntity<?> crearContacto(@Valid @RequestBody ContactoRequest contactoPayload) {
		logger.debug(contactoPayload.toString());
		return ResponseEntity.ok(contactoSrv.guardarContacto(contactoPayload));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Optional<ContactoResponse> contacto = contactoSrv.findById(id);
		if (contacto.isPresent())
			return ResponseEntity.ok(contacto.get());
		return ResponseEntity.notFound().build();
	}

}
