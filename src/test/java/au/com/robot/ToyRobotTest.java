package au.com.robot;

import au.com.robot.model.Position;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ToyRobotTest {
	@Test
	public void returnNullWhenPlaceOutsideBorder(){
		String commands = "PLACE 5,5,EAST\n"+
				"MOVE\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertNull(position);
	}

	@Test
	public void doNothingWhenRobotMoveOutsideBoarder(){
		String commands = "PLACE 4,4,EAST\n"+
				"MOVE\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertEquals(4,position.getX());
		assertEquals(4,position.getY());
		assertEquals("EAST",position.getFace().toString());
	}

	private Position operate(String commands){
		ToyRobot toyRobot = new ToyRobot();
		String[] commandArray = commands.split("\n");

		for(String command: commandArray){
			toyRobot.execute(command);
		}
		return toyRobot.getPosition();
	}


	@Test
	public void discardAllCommandUtilValidPlace(){
		String commands = "LEFT\n"+
				"PLACE 3,2,EAST\n"+
				"MOVE\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertEquals(4,position.getX());
		assertEquals(2,position.getY());
		assertEquals("EAST",position.getFace().toString());
	}

	@Test
	public void returnCurrentPositionAfterTurnRight(){
		String commands = "PLACE 4,4,NORTH\n"+
				"RIGHT\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertEquals(4,position.getX());
		assertEquals(4,position.getY());
		assertEquals("EAST",position.getFace().toString());
	}
	@Test
	public void returnCurrentPositionAfterTurnRight4Times(){
		String commands = "PLACE 4,4,NORTH\n"+
				"RIGHT\n"+
				"RIGHT\n"+
				"RIGHT\n"+
				"RIGHT\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertEquals(4,position.getX());
		assertEquals(4,position.getY());
		assertEquals("NORTH",position.getFace().toString());
	}
	@Test
	public void returnCurrentPositionAfterTurnLeft1(){
		String commands = "PLACE 0,0,SOUTH\n"+
				"LEFT\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(0,position.getY());
		assertEquals("EAST",position.getFace().toString());
	}
	@Test
	public void returnCurrentPositionAfterTurnLeft4Times(){
		String commands = "PLACE 0,0,SOUTH\n"+
				"LEFT\n"+
				"LEFT\n"+
				"LEFT\n"+
				"LEFT\n"+
				"REPORT\n";
		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(0,position.getY());
		assertEquals("SOUTH",position.getFace().toString());
	}

	@Test
	public void returnCurrentPositionAfterMove(){
		String commands = "PLACE 0,0,NORTH\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(1,position.getY());
		assertEquals("NORTH",position.getFace().toString());


	}

	@Test
	public void returnCurrentPositionAfterTurnLeft(){
		String commands = "PLACE 0,0,NORTH\n"+
				"LEFT\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(0,position.getY());
		assertEquals("WEST",position.getFace().toString());

	}

	@Test
	public void returnCurrentPositionAfterMoveAndTurnLeftAndMove(){
		String commands = "PLACE 1,2,EAST\n"+
				"MOVE\n"+
				"MOVE\n"+
				"LEFT\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(3,position.getX());
		assertEquals(3,position.getY());
		assertEquals("NORTH",position.getFace().toString());

	}

	@Test
	public void returnCurrentPositionAfterMoveAndPlace(){
		String commands = "PLACE 1,2,EAST\n"+
				"MOVE\n"+
				"MOVE\n"+
				"LEFT\n"+
				"MOVE\n"+
				"PLACE 0,0,EAST\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(1,position.getX());
		assertEquals(0,position.getY());
		assertEquals("EAST",position.getFace().toString());

	}

	@Test
	public void doNothingWhenEnterInvalidCommand(){
		String commands = "PLACE1 1,2,EAST\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertNull(position);
	}

	@Test
	public void doNothingWhenMoveOutsideNorthBorder(){
		String commands = "PLACE 4,4,NORTH\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(4,position.getX());
		assertEquals(4,position.getY());
		assertEquals("NORTH",position.getFace().toString());
	}
	@Test
	public void doNothingWhenMoveOutsideSouthBorder(){
		String commands = "PLACE 0,0,SOUTH\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(0,position.getY());
		assertEquals("SOUTH",position.getFace().toString());
	}
	@Test
	public void doNothingWhenMoveOutsideWestBorder(){
		String commands = "PLACE 0,0,WEST\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(0,position.getY());
		assertEquals("WEST",position.getFace().toString());
	}
	@Test
	public void returnCurrentPositionWhenMoveSouth(){
		String commands = "PLACE 1,1,SOUTH\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(1,position.getX());
		assertEquals(0,position.getY());
		assertEquals("SOUTH",position.getFace().toString());
	}
	@Test
	public void returnCurrentPositionWhenMoveWest(){
		String commands = "PLACE 1,1,WEST\n"+
				"MOVE\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertEquals(0,position.getX());
		assertEquals(1,position.getY());
		assertEquals("WEST",position.getFace().toString());
	}

	@Test
	public void doNothingWhenTurnRightInInvalidPlace(){
		String commands = "PLACE 5,5,WEST\n"+
				"RIGHT\n"+
				"REPORT\n";

		Position position = operate(commands);
		assertNull(position);
	}
	@Test
	public void returnNoExceptionWhenRunMainMethod(){
		String data = "PLACE 1,1,WEST\n"+
				"MOVE\n"+
				"REPORT\n"+
				"QUIT\n";
		boolean result = false;
		InputStream stdin = System.in;
		try {
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			ToyRobot.main(null);
			result = true;
		} finally {
			System.setIn(stdin);
		}
		assertTrue(result);
	}
}
