/* 2013112015 ¿”¡¯º∑ */

package StatePattern;

public class DoorOpen extends DoorState
{
	public DoorOpen(Door_1 door)
	{
		super(door);
	}
	public void click()
	{
		door.setState(door.STAYOPEN);
	}
	public void timeout()
	{
		door.setState(door.CLOSING);
	}
} 