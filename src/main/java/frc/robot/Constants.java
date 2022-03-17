// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// the date is 16th March and Aarav is absent

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class JoystickConstants {
        public static final int PrimaryStick = 0;
        public static final int SecondaryStick = 1;
        public static final int Brake = 1;
        public static final int Boost = 2;
        public static final int Intake = 3;
        public static final int Outtake = 5;
        public static final int StraightElevatorUp = 8;
        public static final int StraightElevatorDown = 7;
        public static final int AngledElevatorUp = 10;
        public static final int AngledElevatorDown = 9;
        public static final int FeedIn = 4;
        public static final int FeedOut = 6;

        // Add New Joystick Axis
    }

    public final class MotorConstants{
        public static final int kDriveLeftFront = 43;
        public static final int kDriveRightFront = 0;
        public static final int kDriveLeftBack = 0;
        public static final int kDriveRightBack = 0;

        public static final int kShooter = 0;
        public static final int kFeeder = 0;
        public static final int kIntake = 0;

        public static final int kPrimaryElevator = 0;
        public static final int kSecondaryElevator = 0;

        // Add CAN IDs
    }

    public final class SpeedConstants{
        // public static final double kMaxDriveSpeed = 0.8;
        
        public static final double kIntakeSpeed = 0.5;
        public static final double kFeedSpeed = 0.5;

        public static final double kPrimaryUpSpeed = 0.75;
        public static final double kSecondaryUpSpeed = 0.75;
    }

    /*
    public final class ShooterPIDConstants {
        public static final double kP = 0; // update
        public static final double kI = 0; // update
        public static final double kD = 0; // update
        public static final double k_Setpoint = 0; // update
    }
    */
}
