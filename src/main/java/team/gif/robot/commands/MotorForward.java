package team.gif.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.subsystems.TalonMotor;

public class MotorForward extends Command {

    private final TalonMotor motor;
    public MotorForward(TalonMotor motor) {
        this.motor = motor;
        addRequirements(motor);
    }
    @Override
    public void execute() {
        motor.forward();
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
