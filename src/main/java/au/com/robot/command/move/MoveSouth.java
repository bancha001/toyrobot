package au.com.robot.command.move;

import au.com.robot.model.Position;
/*
	Move robot to south one step and prevent it to be outside the boarder
 */
public class MoveSouth implements MoveToDirection {
	public Position move(Position position) {
		int nextPosition = position.getY() -1;
		if(nextPosition >= 0)
		{
			position.setY(nextPosition);
		}else{
			System.out.println("Robot can not move since it reaches the south border");
		}
		return position;
	}
}
