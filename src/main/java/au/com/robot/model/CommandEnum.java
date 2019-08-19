package au.com.robot.model;

public enum CommandEnum {
	PLACE("PLACE"),
	MOVE("MOVE"),
	LEFT("LEFT"),
	RIGHT("RIGHT"),
	REPORT("REPORT");
	private String command;

	CommandEnum(String command) {
		this.command = command;
	}
}
