package floors;

import commands.ExternalFloorBtnCommand;
import components.DirectionLamp;
import elevators.Direction;

public class TopFloor extends Floor{
	
	private DirectionLamp downDirectionLamp;
	private FloorButton downButton;
	private FloorButtonLamp downButtonLamp;
	
	public TopFloor(int max_floor) {
		super(max_floor - 1);
		this.downDirectionLamp = new DirectionLamp(Direction.DOWN);
		this.downButton = new FloorButton(floor, Direction.DOWN);
		this.downButtonLamp = new FloorButtonLamp(floor);
	}
	
	public void turnOnDirectionLamp(Direction direction) {
		downDirectionLamp.turnOnLight();
	}
	
	public void turnOffDirectionLamp(Direction direction) {
		downDirectionLamp.turnOnLight();
	}
	
	public void turnOnButtonLamp(Direction direction) {
		downButtonLamp.turnOn();
	}
	
	public void turnOffButtonLamp(Direction direction) {
		downButtonLamp.turnOff();
	}
	
	public ExternalFloorBtnCommand pushButton(Direction direction) {
		return downButton.pushButton();
	}
}
