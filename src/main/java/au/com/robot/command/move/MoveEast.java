package au.com.robot.command.move;


import au.com.robot.constant.Constants;
import au.com.robot.model.Position;

public class MoveEast implements MoveToDirection {
	public Position move(Position position) {
		int nextPosition = position.getX()+1;
		if(nextPosition < Constants.WIDTH)
		{
			position.setX(nextPosition);
		}else{
			System.out.println("Robot can not move since it reaches the east border");
		}
		return position;
	}
}
