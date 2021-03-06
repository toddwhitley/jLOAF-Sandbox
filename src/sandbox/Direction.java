package sandbox;

public enum Direction {
	NORTH,
	EAST,
	SOUTH,
	WEST,
	;
	public static Direction getPreviousDirection(MovementAction action, Direction currentDirection){
		return null;
	}
	
	public static Direction getNextDirection(MovementAction action, Direction currentDirection){
		return null;
	}
	
	public static Direction convertActToDir(MovementAction action){
		switch(action){
		case MOVE_DOWN:
			return SOUTH;
		case MOVE_LEFT:
			return WEST;
		case MOVE_RIGHT:
			return EAST;
		case MOVE_UP:
			return NORTH;
		case STAND:
			return null;
		default:
			return null;		
		}
	}
	
	public static MovementAction convertDirToAct(Direction currentDirection){
		switch(currentDirection){
		case EAST:
			return MovementAction.MOVE_RIGHT;
		case NORTH:
			return MovementAction.MOVE_UP;
		case SOUTH:
			return MovementAction.MOVE_DOWN;
		case WEST:
			return MovementAction.MOVE_LEFT;
		default:
			return null;
		}
	}
}
