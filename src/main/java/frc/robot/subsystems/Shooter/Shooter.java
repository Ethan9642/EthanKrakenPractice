package frc.robot.subsystems.Shooter;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.SparkPIDController;
import com.revrobotics.CANSparkBase.ControlType;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    
  public CANSparkFlex shooterTopMotor;
  public CANSparkFlex shooterBottomMotor;
  public SparkPIDController shooterTopPID;
  public SparkPIDController shooterBottomPID;

  public Shooter() {
    shooterTopMotor = new CANSparkFlex(16,MotorType.kBrushless);
    shooterTopMotor.setSmartCurrentLimit(80);
    shooterTopMotor.setInverted(true);
    shooterTopMotor.setIdleMode(IdleMode.kCoast);
    shooterTopPID = shooterTopMotor.getPIDController();
    shooterTopPID.setP(02343);
    shooterTopPID.setI(0.002);
    shooterTopPID.setD(0);
    shooterTopPID.setReference(1, ControlType.kVelocity);

    shooterBottomMotor = new CANSparkFlex(26,MotorType.kBrushless);
    shooterBottomMotor.setSmartCurrentLimit(80);
    shooterBottomMotor.setInverted(false);
    shooterBottomMotor.setIdleMode(IdleMode.kCoast);
    shooterBottomPID = shooterBottomMotor.getPIDController();
    shooterBottomPID.setP(10);
    shooterBottomPID.setI(0.002);
    shooterBottomPID.setD(0);
    shooterBottomPID.setReference(1, ControlType.kVelocity);
  }

  public void setPower(double power) {
    shooterTopMotor.set(power);
    shooterBottomMotor.set(power);
  }

  @Override
  public void periodic() {}
}
