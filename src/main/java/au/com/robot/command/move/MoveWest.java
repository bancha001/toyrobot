package au.com.robot.command.move;

import au.com.robot.model.Position;
/*
	Move robot to west one step and prevent it to be outside the boarder
 */
public class MoveWest implements MoveToDirection {
	public Position move(Position position) {
		int nextPosition = position.getX() - 1;
		if(nextPosition >= 0)
		{
			position.setX(nextPosition);
		}else{
			System.out.println("Robot can not move since it reaches the west border");
		}
		return position;
	}
}
