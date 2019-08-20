package au.com.robot.command.move;

import au.com.robot.command.Command;
import au.com.robot.model.Position;
/*
	Make robot move forward according to its current face
 */
public class Move implements Command {
	public Position execute(Position position) {
		if(position != null) {
			MoveToDirection moveToDirection = MoveFactory.getInstance(position.getFace());
			return moveToDirection.move(position);
		}else{
			System.out.println("Need valid place before run this command");
			return null;
		}
	}
}
