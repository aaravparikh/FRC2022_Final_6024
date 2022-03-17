// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.SpeedConstants;

public class FeederSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */

  private final WPI_TalonSRX feeder = new WPI_TalonSRX(MotorConstants.kFeeder);

  public FeederSubsystem() {}

  public void feeding(){
    feeder.set(SpeedConstants.kFeedSpeed);
  }

  public void recalling(){
      feeder.set(-SpeedConstants.kFeedSpeed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}