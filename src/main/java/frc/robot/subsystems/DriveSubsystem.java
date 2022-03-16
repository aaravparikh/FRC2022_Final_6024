// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

import com.kauailabs.navx.frc.AHRS;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  private final WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(MotorConstants.kDriveLeftFront);
  private final WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(MotorConstants.kDriveLeftBack);
  private final WPI_TalonSRX m_frontRight = new WPI_TalonSRX(MotorConstants.kDriveRightFront);
  private final WPI_TalonSRX m_rearRight = new WPI_TalonSRX(MotorConstants.kDriveRightBack);

  private final AHRS m_navX = new AHRS();

private final MotorControllerGroup m_leftMotors = 
  new MotorControllerGroup(m_frontLeft, m_rearLeft);
private final MotorControllerGroup m_rightMotors = 
  new MotorControllerGroup(m_frontRight, m_rearRight);
  

private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors,m_rightMotors);

  public DriveSubsystem() {

    m_rightMotors.setInverted(true);


  }

  public void arcadeDrive(double fwd,double rot){
    m_drive.arcadeDrive(fwd, rot);
  }

  public double getHeading(){
    return m_navX.getCompassHeading();
  }

  public double getTurnRate(){
    return m_navX.getRate();
  }

  public float getRawHeading(){
    return m_navX.getYaw();
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    SmartDashboard.putNumber("Compass Heading", this.getHeading());
    SmartDashboard.putNumber("Turn Rate", this.getTurnRate());
    SmartDashboard.putNumber("Heading", this.getRawHeading());

  }
}
