package au.com.robot.command;

import au.com.robot.model.Position;
/*
	Command interface
 */
public interface Command {
	Position execute(Position position);
}
