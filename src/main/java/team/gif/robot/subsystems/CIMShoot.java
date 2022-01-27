package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class CIMShoot extends SubsystemBase
{
    private static CIMShoot instance = null;

    public static CIMShoot getInstance() {

        if (instance == null) {
            instance = new CIMShoot();
        }
        return instance;
    }
    private static final TalonSRX CIM = new TalonSRX(RobotMap.MOTOR_TALON_ONE);

    public CIMShoot(){
        CIM.setNeutralMode(NeutralMode.Brake);
    }

    public void setSpeed(double speed){
        CIM.set(ControlMode.PercentOutput, speed);
    }
}

