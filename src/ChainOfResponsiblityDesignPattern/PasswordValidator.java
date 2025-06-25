package ChainOfResponsiblityDesignPattern;

public class PasswordValidator extends Validator {

	@Override
	public boolean validate(UserForm form) {
		if (form.password == null || form.password.length() < 6) {
			System.out.println("Invalid password");
			return false;
		}
		return next == null || next.validate(form);
	}

}
