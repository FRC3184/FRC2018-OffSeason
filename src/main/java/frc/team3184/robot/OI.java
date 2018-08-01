package frc.team3184.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;

public class OI {
    private Joystick controller;

    private OI (){
        controller = new Joystick(0);
    }

    public static OI get() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }

    private static OI instance;

    public double getPower() {
        double power;

        power = controller.getY(GenericHID.Hand.kLeft);

        return power;
    }

    public double getTurn() {
        double turn;

        turn = controller.getX(GenericHID.Hand.kRight);

        return turn;
    }
}
