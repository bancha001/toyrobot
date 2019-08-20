package au.com.robot.model;
/*
	Store robot position
 */
public class Position {
	int x;
	int y;
	FaceEnum face;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public FaceEnum getFace() {
		return face;
	}

	public void setFace(FaceEnum face) {
		this.face = face;
	}

}
