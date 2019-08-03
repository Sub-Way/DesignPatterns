/* 2013112015 ¿”¡¯º∑ */

package FactoryPattern;

public class Client {

	public static void main(String[] args) {
		
		Motor lgMotor = MotorFactory.createMotor(MotorID.LG);
		ElevatorController controller1 = new ElevatorController(1, lgMotor);
		controller1.gotoFloor(5);
		controller1.gotoFloor(3);
		 
		Motor hyundaiMotor = MotorFactory.createMotor(MotorID.HYUNDAI);
		controller1 = new ElevatorController(1, hyundaiMotor);
		controller1.gotoFloor(4);
		controller1.gotoFloor(6);
	}
}