package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends CommandBase {
    private IntakeSubsystem Intake;
    private boolean TakeIn;
    private boolean TakeOut;

    public IntakeCommand(IntakeSubsystem intake, boolean takein, boolean takeout){
        this.Intake = intake;
        this.TakeIn = takein;
        this.TakeOut = takeout;
        addRequirements(intake);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        if (TakeIn == true){
            Intake.intaking();
        }
        else if (TakeOut == true){
            Intake.outtaking();
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