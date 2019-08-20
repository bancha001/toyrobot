package au.com.robot.command.place;

import au.com.robot.command.Command;
import au.com.robot.constant.Constants;
import au.com.robot.model.Position;
/*
	Place robot to valid position
 */
public class Place implements Command {
	public Position execute(Position position) {

		if (position.getX() < Constants.WIDTH && position.getX() >= 0
				&& position.getY() < Constants.HEIGHT && position.getY() >= 0
				&& (position.getFace() != null)) {
			return position;
		} else {
			System.out.println("Robot position is not valid");
			return null;
		}
	}
}
