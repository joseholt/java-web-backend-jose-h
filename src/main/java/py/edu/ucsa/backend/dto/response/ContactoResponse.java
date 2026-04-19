package py.edu.ucsa.backend.dto.response;

import py.edu.ucsa.backend.dto.request.ContactoRequest;

public class ContactoResponse extends ContactoRequest{
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
