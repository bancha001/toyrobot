package au.com.robot.command.turn;

import au.com.robot.model.FaceEnum;

import java.util.HashMap;
import java.util.Map;

public class TurnLeftFactory {
	static Map<FaceEnum,TurnLeftFromFace> map = new HashMap<FaceEnum, TurnLeftFromFace>();
	static {
		map.put(FaceEnum.NORTH, new TurnLeftFromNorth());
		map.put(FaceEnum.SOUTH, new TurnLeftFromSouth());
		map.put(FaceEnum.EAST, new TurnLeftFromEast());
		map.put(FaceEnum.WEST, new TurnLeftFromWest());
	}
	public static TurnLeftFromFace getInstance(FaceEnum faceEnum){
		return map.get(faceEnum);
	}
}

