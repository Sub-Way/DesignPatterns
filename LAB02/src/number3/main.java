package number3;

import number3.LightBulb;
import number3.Switchable;

public class main {
	public static void main(String[] args) {
		//Fan f = new Fan();
		LightBulb l = new LightBulb();
		//Switch s1 = new Switch(f);
		//System.out.println(s1);
		ElectricPowerSwitch s2 = new ElectricPowerSwitch (l);
		s2.isOn();
		s2.press();
		System.out.println(s2);
	}
}
