package frc.robot.subsystems.Feeder.States;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Feeder.Feeder;

public class PIDFeedingState extends Command{
    int kP = 1;
    int kI = 1;
    int kD = 1;
    private Feeder feeder;

    PIDController pid = new PIDController(kP, kI, kD);

    public PIDFeedingState(double Type, double TargetPower) {
        pid.setTolerance(5, 10);
        pid.setIntegratorRange(-0.5, 0.5);        
        // Temperary code untill I implement PID
        feeder.setDefaultCommand(new FeedingState(feeder,Type*TargetPower));
    }
}
