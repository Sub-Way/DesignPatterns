/* 2013112015 ¿”¡¯º∑ */

package FactoryPattern;

public class HyundaiMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move Hyundai Motor " + direction);
	}
}
