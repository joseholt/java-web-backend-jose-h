package py.edu.ucsa.backend.controllers;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.ucsa.backend.dto.BackendData;

@RestController
@RequestMapping("api/v1/backend/data")
public class BackendDataController {

	@GetMapping("/full")
	public ResponseEntity<?> getBackendData (){
		BackendData data = new BackendData("JAVA WEB BACKEND JOSE H", "0.0.0-SNAPSHOT", LocalDate.now());
		return ResponseEntity.ok(data);
	}
	
}
