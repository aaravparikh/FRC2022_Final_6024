// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.SpeedConstants;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */

  private final WPI_TalonSRX intaker = new WPI_TalonSRX(MotorConstants.kPrimaryElevator);

  public IntakeSubsystem() {}

  public void intaking(){
    intaker.set(SpeedConstants.kIntakeSpeed);
  }

  public void outtaking(){
    intaker.set(-SpeedConstants.kIntakeSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}