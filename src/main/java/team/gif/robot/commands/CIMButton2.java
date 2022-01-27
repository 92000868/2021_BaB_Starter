package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.subsystems.CIMShoot;
import team.gif.robot.subsystems.LimitSwitch;

public class CIMButton2 extends CommandBase
{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    public CIMButton2()
    {
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        Globals.g_buttonControl = true;
        if(LimitSwitch.getInstance().getState()) {
            CIMShoot.getInstance().setSpeed(-0.1);
        }
        else{
            CIMShoot.getInstance().setSpeed(-0.2);
        }
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished()
    {
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted)
    {
        CIMShoot.getInstance().setSpeed(0);
        Globals.g_buttonControl = false;
    }
}
