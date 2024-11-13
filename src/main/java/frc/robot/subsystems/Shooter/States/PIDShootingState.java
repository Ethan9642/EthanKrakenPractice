package frc.robot.subsystems.Shooter.States;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter.Shooter;


public class PIDShootingState extends Command{
    int kP = 1;
    int kI = 1;
    int kD = 1;
    private Shooter shooter;

    PIDController pid = new PIDController(kP, kI, kD);

    public PIDShootingState(double Type, double TargetPower) {
        pid.setTolerance(5, 10);
        pid.setIntegratorRange(-0.5, 0.5);
        // Placeholder untill I actualy implement PID.
        shooter.setDefaultCommand(new ShootingState(shooter,TargetPower));
    }
}