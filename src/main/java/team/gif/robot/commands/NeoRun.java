package team.gif.robot.commands;

import team.gif.robot.Globals;
import team.gif.robot.subsystems.NeoShooting;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class NeoRun extends CommandBase
{

    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

            public NeoRun()
    {

    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize()
    {

    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute()
    {
        NeoShooting.getInstance().setRPM(60);
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }

    // Returns true when the command is about to end.
    // Should be called once the command ends.
    @Override
    public void end(boolean interrupted)
    {
        NeoShooting.getInstance().setRPM(0);
        Globals.g_buttonControl = false;
    }
}
