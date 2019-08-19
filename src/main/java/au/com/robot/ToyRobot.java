package au.com.robot;

import au.com.robot.command.Command;
import au.com.robot.command.CommandFactory;
import au.com.robot.command.place.Place;
import au.com.robot.model.FaceEnum;
import au.com.robot.model.Position;

import java.util.Scanner;

public class ToyRobot {

	private Position position;

	public static void main(String[] args) {
		String command = "";
		Scanner scanner = new Scanner(System.in);
		final ToyRobot toyRobot = new ToyRobot();
		do {
			command = scanner.nextLine();
			toyRobot.execute(command);
		} while (!command.equalsIgnoreCase("QUIT"));

	}
	public void execute(String commandString) {
		Command command = CommandFactory.getCommand(commandString);
		if (command instanceof Place) {
			setPosition(parsePosition(commandString));
		}
		if(command != null){
			setPosition(command.execute(getPosition()));
		}
	}

	private Position parsePosition(String commandString) {
		Position result = null;
		String[] subCommands = commandString.split(" ");
		if (subCommands.length > 1) {
			String[] positionArray = subCommands[1].split(",");
			if (positionArray.length == 3) {
				result = new Position();
				result.setX(Integer.parseInt(positionArray[0]));
				result.setY(Integer.parseInt(positionArray[1]));
				result.setFace(FaceEnum.valueOf(positionArray[2]));
			}
		}
		return result;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
