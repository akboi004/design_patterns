package CommandDesignPattern;

public class FanOnCommand implements Command {

	private Fan fan;

	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.on();
	}

}
