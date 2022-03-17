package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCommand extends CommandBase {
    private ShooterSubsystem Shooter;
    private boolean Shoot;

    public ShooterCommand(ShooterSubsystem shooter, boolean shoot){
        this.Shooter = shooter;
        this.Shoot = shoot;
        addRequirements(shooter);
    }

    @Override
    public void initialize(){
    }

    @Override
    public void execute(){
        if (Shoot == true){
            Shooter.shoot(1);
        }
    }

    @Override
    public void end (boolean interrupted){
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}