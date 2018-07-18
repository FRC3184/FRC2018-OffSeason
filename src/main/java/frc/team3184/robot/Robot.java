package frc.team3184.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team3184.robot.commands.TeleopDrive;
import frc.team3184.robot.subsystems.DriveSystem;

public class Robot extends TimedRobot {
    private DriveSystem drive;
    private TeleopDrive teleopDrive;

    @Override
    public void robotInit() {
        Scheduler.getInstance().enable();
        drive = new DriveSystem();
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() {
        teleopDrive = new TeleopDrive(drive);

        teleopDrive.start();
    }

    @Override
    public void testInit() { }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }
    
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {
        Scheduler.getInstance().run();
    }
}