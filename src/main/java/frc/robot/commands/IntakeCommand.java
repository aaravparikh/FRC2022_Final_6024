package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends CommandBase {
    private IntakeSubsystem intake;

    public IntakeCommand(IntakeSubsystem intake){
        this.intake = intake;
        addRequirements(intake);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        intake.intaking(0.6);
    }

    @Override
    public void end (boolean interrupted){
        intake.intaking(0);
    }

    @Override
    public boolean isFinished(){
        return false;
    }
   
}