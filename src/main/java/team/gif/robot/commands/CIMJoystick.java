package team.gif.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.CIMShoot;

public class CIMJoystick extends CommandBase
{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    public CIMJoystick() {
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        if (Globals.g_buttonControl == false) {
            double joystick = -Robot.oi.driver.getY(GenericHID.Hand.kLeft);
            CIMJoystick.getInstance().setSpeed(joystick);
        }
    }

    private static CIMShoot getInstance() {
        return null;
    }


    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        CIMJoystick.getInstance().setSpeed(0);
    }












}
