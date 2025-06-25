package ChainOfResponsiblityDesignPattern;

abstract class Validator {

	protected Validator next;

	public Validator setNext(Validator next) {
		this.next = next;
		return next;
	}

	public abstract boolean validate(UserForm form);

}
