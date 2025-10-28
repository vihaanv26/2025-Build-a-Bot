package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import team.gif.robot.subsystems.TalonMotor;
import team.gif.robot.OI;

import static team.gif.robot.Robot.oi;

public class MotorJoystickControl extends Command {

    private final TalonMotor motor;

    public MotorJoystickControl(TalonMotor motor, CommandXboxController driver) {
        this.motor = motor;
        addRequirements(motor);

    }

    @Override
    public void execute() {
        double value = oi.driver.getLeftY();
        motor.setPercentOutput(value);
    }

    @Override
    public void end(boolean interrupted) {
        motor.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}


