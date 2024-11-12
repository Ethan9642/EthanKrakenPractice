package frc.robot.subsystems.Shooter;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    
  public CANSparkFlex shooterMotorTop;
  public CANSparkFlex shooterMotorBottom;

  public Shooter() {
    shooterMotorTop = new CANSparkFlex(16,MotorType.kBrushless);
    shooterMotorTop.setSmartCurrentLimit(80);
    shooterMotorTop.setInverted(true);
    shooterMotorTop.setIdleMode(IdleMode.kCoast);
    shooterMotorBottom = new CANSparkFlex(26,MotorType.kBrushless);
    shooterMotorBottom.setSmartCurrentLimit(80);
    shooterMotorBottom.setInverted(false);
    shooterMotorBottom.setIdleMode(IdleMode.kCoast);
  }

  public void setPower(double power) {
    shooterMotorTop.set(power);
    shooterMotorBottom.set(power);
  }

  @Override
  public void periodic() {
  }
}
