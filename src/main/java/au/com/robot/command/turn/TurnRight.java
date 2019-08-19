package au.com.robot.command.turn;

import au.com.robot.command.Command;
import au.com.robot.model.Position;

public class TurnRight implements Command {
	public Position execute(Position position) {
		if(position != null) {
			TurnRightFromFace turnRightFromFace = TurnRightFactory.getInstance(position.getFace());
			return turnRightFromFace.turn(position);
		}else{
			System.out.println("Need valid place before run this command");
			return null;
		}
	}
}
