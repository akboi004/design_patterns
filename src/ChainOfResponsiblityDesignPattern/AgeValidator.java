package ChainOfResponsiblityDesignPattern;

public class AgeValidator extends Validator {

	@Override
	public boolean validate(UserForm form) {
		if (form.age < 18) {
			System.out.println("You must be above 18 years");
			return false;
		}
		return next == null || next.validate(form);
	}

}
