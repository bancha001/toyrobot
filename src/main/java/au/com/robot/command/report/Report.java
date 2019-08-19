package au.com.robot.command.report;

import au.com.robot.command.Command;
import au.com.robot.model.Position;

public class Report implements Command {
	public Position execute(Position position) {
		if(position != null) {
			System.out.println(position.getX() + "," + position.getY() + "," + position.getFace().toString());
		}
		return position;
	}
}
