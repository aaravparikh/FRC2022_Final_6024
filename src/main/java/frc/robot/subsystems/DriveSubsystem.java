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

  private final WPI_TalonSRX FrontLeft = new WPI_TalonSRX(MotorConstants.kDriveLeftFront);
  private final WPI_TalonSRX BackLeft = new WPI_TalonSRX(MotorConstants.kDriveLeftBack);
  private final WPI_TalonSRX FrontRight = new WPI_TalonSRX(MotorConstants.kDriveRightFront);
  private final WPI_TalonSRX BackRight = new WPI_TalonSRX(MotorConstants.kDriveRightBack);

  private final AHRS NavX = new AHRS();

  private final MotorControllerGroup LeftGroup = new MotorControllerGroup(FrontLeft, BackLeft);
  private final MotorControllerGroup RightGroup = new MotorControllerGroup(FrontRight, BackRight);
  

  private final DifferentialDrive Drive = new DifferentialDrive(LeftGroup, RightGroup);

  public DriveSubsystem() {
    RightGroup.setInverted(true);
  }

  public void arcadeDrive(double leftSpeed, double rightSpeed){
    Drive.arcadeDrive(leftSpeed, rightSpeed);
  }

  public double getHeading(){
    return NavX.getCompassHeading();
  }

  public double getTurnRate(){
    return NavX.getRate();
  }

  public float getRawHeading(){
    return NavX.getYaw();
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Compass Heading", this.getHeading());
    SmartDashboard.putNumber("Turn Rate", this.getTurnRate());
    SmartDashboard.putNumber("Heading", this.getRawHeading());

  }
}