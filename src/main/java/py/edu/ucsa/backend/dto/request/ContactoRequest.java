package py.edu.ucsa.backend.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ContactoRequest {
	
	@NotBlank(message = "El nombre no puede estar en blanco")
	private String nombre;
	
	@Email(message = "Debe ingresar un email válido")
	@NotBlank(message = "El email no puede estar en blanco")
	private String email;
	
	@Size(max = 14, message = "El tamaño máximo para el teléfono es de 14 caracteres")
	private String telefono;
	
	public ContactoRequest() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "ContactoRequest [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
}
