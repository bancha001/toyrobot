package au.com.robot.command.turn;


import au.com.robot.model.FaceEnum;
import au.com.robot.model.Position;
/*
	Turn left from facing west
 */
public class TurnLeftFromWest implements TurnLeftFromFace {
	public Position turn(Position position) {
		position.setFace(FaceEnum.SOUTH);
		return position;
	}
}
