package CommandDesignPattern;

public class ClientCode {

	public static void main(String[] args) {

		Light light = new Light();
		Fan fan = new Fan();

		Command lightsOnCommand = new LightsOnCommand(light);
		Command lightsOffCommand = new LightsOffCommand(light);
		Command fanOn = new FanOnCommand(fan);

		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(lightsOnCommand);
		remoteController.pressButton();

		remoteController.setCommand(lightsOffCommand);
		remoteController.pressButton();

		remoteController.setCommand(fanOn);
		remoteController.pressButton();

	}
}
