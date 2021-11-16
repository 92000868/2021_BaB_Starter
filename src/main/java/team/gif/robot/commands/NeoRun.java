package team.gif.robot.commands;

import team.gif.robot.Globals;
import team.gif.robot.subsystems.NeoShooting;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class NeoRun extends CommandBase
{

    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    public NeoRun() {
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        NeoShooting.getInstance().setPID(60);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        NEOCommand.getInstance().setVoltage(0);
        Globals.g_buttonControl = false;

    }
}
