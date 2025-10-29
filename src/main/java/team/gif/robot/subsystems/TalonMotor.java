package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class TalonMotor extends SubsystemBase {

    private TalonSRX motor;

    public TalonMotor() {
        motor = new TalonSRX(RobotMap.TALON_ID);
        motor.configFactoryDefault();
        motor.setNeutralMode(NeutralMode.Brake);
    }


        public void setPercentOutput ( double percent) {
            if (Robot.limitSwitch.isOn()) {
                motor.set(ControlMode.PercentOutput, percent / 2);
            } else {
                motor.set(ControlMode.PercentOutput, percent);
            }
        }
    }
