package au.com.robot.command.move;

import au.com.robot.model.FaceEnum;

import java.util.HashMap;
import java.util.Map;
/*
	MoveFactory returns a move instance according to current face
 */
public class MoveFactory {
	static Map<FaceEnum,MoveToDirection> map = new HashMap<FaceEnum, MoveToDirection>();
	static {
		map.put(FaceEnum.NORTH, new MoveNorth());
		map.put(FaceEnum.SOUTH, new MoveSouth());
		map.put(FaceEnum.EAST, new MoveEast());
		map.put(FaceEnum.WEST, new MoveWest());
	}
	public static MoveToDirection getInstance(FaceEnum faceEnum){
		return map.get(faceEnum);
	}
}

