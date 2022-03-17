package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.Constants.*;

public class ShooterCommand extends CommandBase {
    private ShooterSubsystem Shooter;
    private PIDController pidController;
    private boolean Shoot;

    public ShooterCommand(ShooterSubsystem shooter, boolean shoot, double setpoint){
        this.Shooter = shooter;
        this.Shoot = shoot;
        this.pidController = new PIDController(ShooterPIDConstants.kP, ShooterPIDConstants.kI, ShooterPIDConstants.kD);
        pidController.setSetpoint(ShooterPIDConstants.k_Setpoint);
        addRequirements(shooter);
    }

    @Override
    public void initialize(){
        pidController.reset();
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