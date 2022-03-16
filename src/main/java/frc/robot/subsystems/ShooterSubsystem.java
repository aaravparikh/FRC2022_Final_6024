// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;
import frc.robot.Constants.SpeedConstants;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */

  private final WPI_TalonSRX m_cannon = new WPI_TalonSRX(MotorConstants.kShooter);

  private final WPI_TalonSRX m_loader = new WPI_TalonSRX(MotorConstants.kFeeder);


  public ShooterSubsystem() {}

  public void shoot(double speed){
    m_cannon.set(speed);
  }

  public void feed(){
    m_loader.set(SpeedConstants.kFeedSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
