package team.gif.robot.commands;

import team.gif.robot.Constants;
import team.gif.robot.subsystems.SparkMAXMotor;

public class SparkMAXVoltageVoltageCommand extends CommandTemplate{

    private final SparkMAXMotor motor;

    public SparkMAXVoltageVoltageCommand(SparkMAXMotor motor) {
        this.motor = motor;
        addRequirements(motor);
    }

    @Override
    public void initialize() {
        motor.setVoltage(Constants.SPARKMAX_VOLTAGE);
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
