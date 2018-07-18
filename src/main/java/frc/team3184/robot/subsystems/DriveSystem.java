package frc.team3184.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSystem extends Subsystem {
    private WPI_TalonSRX leftMaster;
    private WPI_TalonSRX rightMaster;
    private VictorSPX leftSlave;
    private VictorSPX rightSlave;

    private DifferentialDrive robotDrive;

    @Override
    protected void initDefaultCommand() {

    }

    public DriveSystem () {
        leftMaster = new WPI_TalonSRX(0);
        rightMaster = new WPI_TalonSRX(1);
        leftSlave = new VictorSPX(2);
        rightSlave = new VictorSPX(3);
        robotDrive = new DifferentialDrive(leftMaster, rightMaster);

        leftSlave.follow(leftMaster);
        rightSlave.follow(rightMaster);
    }

    public void arcadeDrive (double power, double turn) {
        robotDrive.arcadeDrive(power, turn);
    }
}
