// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.*;
import frc.robot.commands.DriveCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.JoystickConstants;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Joystick DriveStick = new Joystick(Constants.JoystickConstants.PrimaryStick);
  private final Joystick SystemsStick = new Joystick(Constants.JoystickConstants.SecondaryStick);
  
  private final DriveSubsystem RobotDrive = new DriveSubsystem();
  private final ElevatorSubsystem Elevator = new ElevatorSubsystem();
  private final ShooterSubsystem Shooter = new ShooterSubsystem();

//  private final DriveCommand Drive = new DriveCommand(RobotDrive, DriveStick.getY(), DriveStick.getZ());

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(DriveStick, JoystickConstants.Brake).whileHeld(() -> RobotDrive.arcadeDrive(0, 0));
    new JoystickButton(DriveStick, JoystickConstants.Boost).whileHeld(() -> RobotDrive.arcadeDrive(DriveStick.getY(), 0));
    new JoystickButton(SystemsStick, JoystickConstants.StraightElevatorUp).whileHeld(() -> Elevator.primaryUp());
    new JoystickButton(SystemsStick, JoystickConstants.StraightElevatorDown).whileHeld(() -> Elevator.primaryDown());
    new JoystickButton(SystemsStick, JoystickConstants.AngledElevatorDown).whileHeld(() -> Elevator.secondaryUp());
    new JoystickButton(SystemsStick, JoystickConstants.AngledElevatorDown).whileHeld(() -> Elevator.secondaryDown());

    RobotDrive.setDefaultCommand(new DriveCommand (RobotDrive, () -> DriveStick.getY(), () -> DriveStick.getZ()));

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
    //m_autoCommand;
  }
}
