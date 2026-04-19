package py.edu.ucsa.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.ucsa.backend.dto.request.ContactoRequest;
import py.edu.ucsa.backend.dto.response.ContactoResponse;
import py.edu.ucsa.backend.entity.Contacto;
import py.edu.ucsa.backend.repository.ContactoRepository;

@Service
public class ContactoService {
	
	@Autowired
	private ContactoRepository repo; //Inyección de dependencia (DI)
	
	public String guardarContacto(ContactoRequest request) {
		Contacto entity = Contacto.createEntityFromDto(request);
		repo.save(entity);
		return "Se ha creado el contacto con email: " + entity.getEmail() + " con el id: " + entity.getId();
	}
	
	public Optional<ContactoResponse> findById(Long id) {
		Optional<Contacto> encontrado = repo.findById(id);
		if (encontrado.isEmpty()) return Optional.empty();
		return Optional.of(Contacto.castEntityToDto(encontrado.get()));
	}
}
