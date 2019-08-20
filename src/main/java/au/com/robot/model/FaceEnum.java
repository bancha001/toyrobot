package au.com.robot.model;
/*
	FaceEnum provides robot valid face
 */
public enum FaceEnum {
	NORTH("NORTH"),
	SOUTH("SOUTH"),
	EAST("EAST"),
	WEST("WEST");


	private String face;

	FaceEnum(String face) {
		this.face = face;
	}

}
