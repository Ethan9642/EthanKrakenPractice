// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Feeder.States;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Feeder.Feeder;

public class FeedingState extends Command {
  Feeder feeder;
  double power;

  public FeedingState(Feeder feeder, double power) {
    this.feeder = feeder;
    this.power = power;
    //??????
    //addRequirements(feeder);
  }

  @Override
  public void initialize() {
    feeder.setPower(power);
  }
  
  @Override
  public void end(boolean interrupted) {
    feeder.setPower(0.0);
  }
}
