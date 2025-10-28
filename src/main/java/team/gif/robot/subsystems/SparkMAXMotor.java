package team.gif.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;


public class SparkMAXMotor extends SubsystemBase {

    private final Spark spark;

    public SparkMAXMotor() {
        spark = new Spark(RobotMap.SPARKMAX_ID);
    }

    public void setVoltage(double volts) {
        double precentOutput= volts / 12;
        spark.set(precentOutput);
    }

    public void stop() {
        spark.stopMotor();
    }

}
