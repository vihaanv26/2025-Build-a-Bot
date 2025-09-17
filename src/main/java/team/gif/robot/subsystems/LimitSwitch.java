package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import team.gif.robot.RobotMap;


public class LimitSwitch {

    private static final DigitalInput LimitSwitch  = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);

    public static boolean isOn() {
        return LimitSwitch.get();
    }

}



