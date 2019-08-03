/* 2013112015 ¿”¡¯º∑ */

package FactoryPattern;

public abstract class Motor {
	private MotorStatus motorStatus;
	
	public Motor() {
		motorStatus = MotorStatus.STOPPING;
	}
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;
		setMotorStatus(MotorStatus.MOVING);
	}
	public void stop(Direction direction) {
		// TODO Auto-generated method stub
		
	}
}