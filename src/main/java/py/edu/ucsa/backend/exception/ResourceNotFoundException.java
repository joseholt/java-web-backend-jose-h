package py.edu.ucsa.backend.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3948985458173503100L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
