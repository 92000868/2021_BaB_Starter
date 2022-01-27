package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.subsystems.NeoShooting;

public class NEOCommand extends CommandBase
{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    public NEOCommand()
    {

    }
    // Called when the command is initially scheduled.
    @Override
    public void initialize()
    {

    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        NeoShooting.getInstance().setVoltage(2.5);
        Globals.g_buttonControl = true;
    }

    static NeoShooting getInstance()
    {
        return null;
    }


    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted)
    {
        NeoShooting.getInstance().setVoltage(0);
        Globals.g_buttonControl = false;
    }
}