package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class TalonMotor extends SubsystemBase {

    private TalonSRX motor;

    public TalonMotor() {
        motor = new TalonSRX(RobotMap.TALON_ID);
    }

    public void forward() {
        motor.set(ControlMode.PercentOutput, Constants.MOTOR_FORWARD_SPEED);
    }

    public void reverse() {
        motor.set(ControlMode.PercentOutput, Constants.MOTOR_REVERSE_SPEED);
    }

    public void stop() {
        motor.set(ControlMode.PercentOutput, 0);
    }

    //public void setPercentOutput(double percent) {
      //  motor.set(ControlMode.PercentOutput, percent);
    //}

    public void setPercentOutput(double percent) {
        if (LimitSwitch.isOn()) {
            motor.set(ControlMode.PercentOutput, percent*0.5);
        } else {
            motor.set(ControlMode.PercentOutput, percent);
        }
    }
}
