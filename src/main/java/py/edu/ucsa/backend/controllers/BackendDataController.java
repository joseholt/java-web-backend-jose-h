package py.edu.ucsa.backend.controllers;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.ucsa.backend.dto.BackendData;

@RestController
@RequestMapping("/api/v1/backend/data")
public class BackendDataController {
	
	@GetMapping("/full")
	public ResponseEntity<?> getBackendData(){
		BackendData data = new BackendData();
		data.setProjectName("JAVA WEB BACKEND PABLOR");
		data.setProjectVersion("0.0.0-SNAPSHOT");
		data.setProjectVersionDate(LocalDate.now());
		
		return ResponseEntity.ok(data);
	}
	
	@PostMapping("/lite/{version}")
	public ResponseEntity<?> getBackendDataLite(@PathVariable String version){
		BackendData data = new BackendData();
		data.setProjectName("JAVA WEB BACKEND");
		data.setProjectVersion(version);
		data.setProjectVersionDate(LocalDate.now());
		
		return ResponseEntity.ok(data);
	}
}
