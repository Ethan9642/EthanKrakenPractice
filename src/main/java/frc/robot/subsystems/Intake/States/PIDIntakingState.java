package frc.robot.subsystems.Intake.States;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;

public class PIDIntakingState extends Command{
    int kP = 1;
    int kI = 1;
    int kD = 1;
    double TargetPower = 0.0;

    PIDController pid = new PIDController(kP, kI, kD);

    public PIDIntakingState(double Type, double Trigger) {
        pid.setTolerance(5, 10);
        pid.setIntegratorRange(-0.5, 0.5);
        TargetPower = Trigger;
    }
}
