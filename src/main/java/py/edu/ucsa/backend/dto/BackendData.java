package py.edu.ucsa.backend.dto;

import java.time.LocalDate;

public record BackendData (String projectName, String projectVersion, LocalDate projectVersionDate) {
}
