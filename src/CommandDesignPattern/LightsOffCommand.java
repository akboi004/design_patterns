package CommandDesignPattern;

public class LightsOffCommand implements Command {

	private Light light;

	public LightsOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
