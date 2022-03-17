package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class StraightElevatorCommand extends CommandBase {
    private ElevatorSubsystem Elevator;
    private boolean GoUp;
    private boolean GoDown;

    public StraightElevatorCommand(ElevatorSubsystem elevator, boolean GoUp, boolean GoDown){
        this.Elevator = elevator;
        this.GoUp = GoUp;
        this.GoDown = GoDown;
        addRequirements(elevator);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        if (GoUp == true){
            Elevator.StraightUp();
        }
        else if (GoDown == true){
            Elevator.StraightDown();
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