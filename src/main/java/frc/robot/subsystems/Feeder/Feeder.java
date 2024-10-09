package frc.robot.subsystems.Feeder;

// Unnessesary?
// import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder {
    
  public CANSparkFlex feederMotor;

  public Feeder() {
    feederMotor = new CANSparkFlex(17,MotorType.kBrushless);
    feederMotor.setSmartCurrentLimit(80);
    feederMotor.setInverted(false);
    feederMotor.setIdleMode(IdleMode.kCoast);
  }

  public void setPower(double power) {
    feederMotor.set(power);
  }

  // @Override
  // public void periodic() {
  // }
}
