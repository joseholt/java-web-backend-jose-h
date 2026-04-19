package py.edu.ucsa.backend.entity;

import org.springframework.beans.BeanUtils;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import py.edu.ucsa.backend.dto.request.ContactoRequest;
import py.edu.ucsa.backend.dto.response.ContactoResponse;

@Entity
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String email; 
	private String telefono;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

	public static ContactoResponse castEntityToDto(Contacto entity) {
		ContactoResponse dto = new ContactoResponse();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	
	public static Contacto createEntityFromDto(ContactoRequest dto) {
		Contacto entity = new Contacto();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
}
