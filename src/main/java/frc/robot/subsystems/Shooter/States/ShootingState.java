// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Shooter.States;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter.Shooter;

public class ShootingState extends Command {
  Shooter shooter;
  double power;

  public ShootingState(Shooter shooter, double power) {
    this.shooter = shooter;
    this.power = power;
    //??????
    //addRequirements(feeder);
  }

  @Override
  public void initialize() {
    shooter.setPower(power);
  }
  
  @Override
  public void end(boolean interrupted) {
    shooter.setPower(0.0);
  }
}
