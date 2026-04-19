package py.edu.ucsa.backend.dto;

import java.time.LocalDate;

public class BackendData {
	private String projectName;
	private String projectVersion;
	private LocalDate projectVersionDate;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectVersion() {
		return projectVersion;
	}
	public void setProjectVersion(String projectVersion) {
		this.projectVersion = projectVersion;
	}
	public LocalDate getProjectVersionDate() {
		return projectVersionDate;
	}
	public void setProjectVersionDate(LocalDate projectVersionDate) {
		this.projectVersionDate = projectVersionDate;
	}
}
