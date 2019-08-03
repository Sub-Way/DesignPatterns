/* 2013112015 ¿”¡¯º∑ */

package StatePattern;

public class DoorClosing extends DoorState {

	public DoorClosing(Door_1 door) {
		super(door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		door.setState(door.OPENING);
	}
	public void complete(){
		door.setState(door.CLOSED);
	}
}
