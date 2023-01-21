package rwl.employee.crud.opt.exception.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralExceptionHandler {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorResponse> nullPointerExceptionHandler() {
		
		ErrorResponse error= new ErrorResponse();
		error.setErrorMessage("because of null value gating error");
		error.setStatus(HttpStatus.BAD_GATEWAY);
		
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<ErrorResponse> arrayIndexOFBExceptionHandler() {
		ErrorResponse error= new ErrorResponse();
		error.setErrorMessage("here array size is small than index value");
		error.setStatus(HttpStatus.NOT_IMPLEMENTED);
		
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.NOT_IMPLEMENTED);
	}
	
	// 
	
	@ExceptionHandler(EmployeeNotExist.class)
	public ResponseEntity<ErrorResponse> employeeNotExistHandler() {
		ErrorResponse error= new ErrorResponse();
		error.setErrorMessage("Current employee id is not present in DB");
		error.setStatus(HttpStatus.OK);
		
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.OK);
	}
}
