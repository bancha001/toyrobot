package au.com.robot.command;

import au.com.robot.model.Position;

public interface Command {
	Position execute(Position position);
}
