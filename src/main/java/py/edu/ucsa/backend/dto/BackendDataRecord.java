package py.edu.ucsa.backend.dto;

import java.time.LocalDate;

public record BackendDataRecord(
		String projectName, 
		String projectVersion, 
		LocalDate projectVersionDate) {

}
