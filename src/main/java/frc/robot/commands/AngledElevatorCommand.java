package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class AngledElevatorCommand extends CommandBase {
    private ElevatorSubsystem Elevator;
    private boolean UpSlant;
    private boolean DownSlant;

    public AngledElevatorCommand(ElevatorSubsystem elevator, boolean UpSlant, boolean DownSlant){
        this.Elevator = elevator;
        this.UpSlant = UpSlant;
        this.DownSlant = DownSlant;
        addRequirements(elevator);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        if (UpSlant == true){
            Elevator.secondaryUp();
        }
        else if (DownSlant == true){
            Elevator.secondaryDown();
        }
        else {
            Elevator.stopSecondary();
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