package frc.robot.subsystems.Feeder;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkBase.ControlType;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.SparkPIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
    
  public CANSparkFlex feederMotor;
  public SparkPIDController feederPID;

  public Feeder() {
    feederMotor = new CANSparkFlex(17,MotorType.kBrushless);
    feederMotor.setSmartCurrentLimit(80);
    feederMotor.setInverted(false);
    feederMotor.setIdleMode(IdleMode.kCoast);
    feederPID = feederMotor.getPIDController();
    feederPID.setP(10);
    feederPID.setI(0.002);
    feederPID.setD(0);
    feederPID.setReference(1, ControlType.kVelocity);
  }

  public void setPower(double power) {
    feederMotor.set(power);
  }

  @Override
  public void periodic() {}
}
