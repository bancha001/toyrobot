package au.com.robot.command;

import au.com.robot.command.move.Move;
import au.com.robot.command.place.Place;
import au.com.robot.command.report.Report;
import au.com.robot.command.turn.TurnLeft;
import au.com.robot.command.turn.TurnRight;
import au.com.robot.model.CommandEnum;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
	static Map<String, Command> map = new HashMap<String, Command>();

	static {
		map.put(CommandEnum.PLACE.toString(), new Place());
		map.put(CommandEnum.MOVE.toString(), new Move());
		map.put(CommandEnum.LEFT.toString(), new TurnLeft());
		map.put(CommandEnum.RIGHT.toString(), new TurnRight());
		map.put(CommandEnum.REPORT.toString(), new Report());

	}

	public static Command getCommand(String command) {
		String[] commandLine = command.split(" ");
		return map.get(commandLine[0]);
	}
}
