package au.com.robot.command.turn;

import au.com.robot.model.FaceEnum;

import java.util.HashMap;
import java.util.Map;

public class TurnRightFactory {
	static Map<FaceEnum,TurnRightFromFace> map = new HashMap<FaceEnum, TurnRightFromFace>();
	static {
		map.put(FaceEnum.NORTH, new TurnRightFromNorth());
		map.put(FaceEnum.SOUTH, new TurnRightFromSouth());
		map.put(FaceEnum.EAST, new TurnRightFromEast());
		map.put(FaceEnum.WEST, new TurnRightFromWest());

	}
	public static TurnRightFromFace getInstance(FaceEnum faceEnum){
		return map.get(faceEnum);
	}
}

