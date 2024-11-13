package frc.robot.subsystems.Intake.States;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake.Intake;

public class PIDIntakingState extends Command{
    int kP = 1;
    int kI = 1;
    int kD = 1;
    private Intake intake;

    PIDController pid = new PIDController(kP, kI, kD);

    public PIDIntakingState(double Type, double TargetPower) {
        pid.setTolerance(5, 10);
        pid.setIntegratorRange(-0.5, 0.5);        
        // Temperary code untill I implement PID
        intake.setDefaultCommand(new IntakingState(intake,(Type*TargetPower)));
    }
}
