package au.com.robot.command.turn;

import au.com.robot.model.FaceEnum;
import au.com.robot.model.Position;

public class TurnRightFromEast implements TurnRightFromFace {
	public Position turn(Position position) {
		position.setFace(FaceEnum.SOUTH);
		return position;
	}
}
