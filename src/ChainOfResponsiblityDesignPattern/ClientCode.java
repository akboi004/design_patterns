package ChainOfResponsiblityDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		Validator validatorChain = new EmailValidator();
		validatorChain.setNext(new PasswordValidator());
		validatorChain.setNext(new AgeValidator());

		UserForm userForm1 = new UserForm("alwin@gmail.com", "may25afa", 25);
		System.out.println("Validation Passed? " + validatorChain.validate(userForm1));

		UserForm userForm2 = new UserForm("aslasfa", null, 15);
		System.out.println("Validation Passed? " + validatorChain.validate(userForm2));
	}
}
