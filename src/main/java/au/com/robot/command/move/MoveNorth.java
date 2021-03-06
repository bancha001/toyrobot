package au.com.robot.command.move;

import au.com.robot.constant.Constants;
import au.com.robot.model.Position;
/*
	Move robot to north one step and prevent it to be outside the boarder
 */
public class MoveNorth implements MoveToDirection {
	public Position move(Position position) {
		int nextPosition = position.getY()+1;
		if(nextPosition < Constants.HEIGHT)
		{
			position.setY(nextPosition);
		}else{
			System.out.println("Robot can not move since it reaches the north border");
		}
		return position;
	}
}
