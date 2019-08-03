/* 2013112015 ¿”¡¯º∑ */

package StatePattern;

public class DoorOpening extends DoorState {

	public DoorOpening(Door_1 door) {
		super(door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		door.setState(door.CLOSING);
	}
	
	public void complete(){
		door.setState(door.OPEN);
	}

}
