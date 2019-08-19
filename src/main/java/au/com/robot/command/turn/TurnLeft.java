package au.com.robot.command.turn;

import au.com.robot.command.Command;
import au.com.robot.model.Position;

public class TurnLeft implements Command {
	public Position execute(Position position) {
		if(position != null) {
			TurnLeftFromFace turnLeftFromFace = TurnLeftFactory.getInstance(position.getFace());
			return turnLeftFromFace.turn(position);
		}else{
			System.out.println("Need valid place before run this command");
			return null;
		}
	}
}
