package customException;

public class AgeInvalidException extends RuntimeException{
	
	private String message;
	
	AgeInvalidException(String name){
		this.message=message;
	}
    @Override
	public String getMessage() {
		return message;
	}


}
