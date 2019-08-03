/* 2013112015 ¿”¡¯º∑ */

package FactoryPattern;

public class MotorFactory {
	public static Motor createMotor(MotorID motorID){
		Motor motor = null;

		switch (motorID) {
		case LG:
			motor = new LGMotor();
			break;
		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}