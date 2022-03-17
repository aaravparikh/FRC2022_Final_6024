// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.SpeedConstants;

public class ElevatorSubsystem extends SubsystemBase {
  /** Creates a new ElevatorSubsystem. */

  private final VictorSP StraightElevator = new VictorSP(MotorConstants.kPrimaryElevator);
  private final VictorSP AngledElevator = new VictorSP(MotorConstants.kSecondaryElevator);

  public ElevatorSubsystem() {}

  public void StraightUp(){
    StraightElevator.set(SpeedConstants.kPrimaryUpSpeed);
  }

  public void StraightDown(){
    StraightElevator.set(-SpeedConstants.kPrimaryUpSpeed);
  }

  public void AngledUp(){
    AngledElevator.set(SpeedConstants.kSecondaryUpSpeed);
  }

  public void AngledDown(){
    AngledElevator.set(-SpeedConstants.kSecondaryUpSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}