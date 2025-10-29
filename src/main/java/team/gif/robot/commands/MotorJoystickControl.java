package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.TalonMotor;
import team.gif.robot.OI;

import static team.gif.robot.Robot.oi;
import static team.gif.robot.Robot.talonMotor;

public class MotorJoystickControl extends Command {



    public MotorJoystickControl() {
        super();
        addRequirements(Robot.talonMotor);

    }

    @Override
    public void execute() {
        double value = Robot.oi.driver.getLeftY();
        Robot.talonMotor.setPercentOutput(-value);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {}
}


