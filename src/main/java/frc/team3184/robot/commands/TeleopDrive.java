package frc.team3184.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3184.robot.OI;
import frc.team3184.robot.subsystems.DriveSystem;

public class TeleopDrive extends Command {
    DriveSystem drive;

    public TeleopDrive(DriveSystem drive) {
        super("MyCommandName");
        requires(drive);
        this.drive = drive;
    }

    // 	initialize() - This method sets up the command and is called immediately before the command is executed for the first time and every subsequent time it is started .
    //  Any initialization code should be here.
    protected void initialize() {
    }

    /*
     *	execute() - This method is called periodically (about every 20ms) and does the work of the command. Sometimes, if there is a position a
     *  subsystem is moving to, the command might set the target position for the subsystem in initialize() and have an empty execute() method.
     */
    protected void execute() {
        drive.arcadeDrive(OI.get().getPower(), OI.get().getTurn());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    protected void end() {

    }
}
