package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
    
    private DriveSubsystem robotDrive;
    private double leftspeed;
    private double rightspeed;

    public DriveCommand(DriveSubsystem robotDrive, double leftspeed, double rightspeed){
        this.robotDrive = robotDrive;
        this.leftspeed = leftspeed;
        this.rightspeed = rightspeed;
        addRequirements(robotDrive);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        robotDrive.arcadeDrive(leftspeed, rightspeed);
    }

    @Override
    public void end (boolean interrupted){
        robotDrive.arcadeDrive(0, 0);
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}