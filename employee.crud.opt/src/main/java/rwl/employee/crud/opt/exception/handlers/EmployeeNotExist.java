package rwl.employee.crud.opt.exception.handlers;

public class EmployeeNotExist extends RuntimeException {

	public EmployeeNotExist() {
		super("This is EmployeeNotExist exception");
	}
}
