package ChainOfResponsiblityDesignPattern;

public class EmailValidator extends Validator {

	@Override
	public boolean validate(UserForm form) {
		if (form.email == null || !form.email.contains("@")) {
			System.out.println("Invalid Email");
			return false;
		}
		return next == null || next.validate(form);
	}

}
