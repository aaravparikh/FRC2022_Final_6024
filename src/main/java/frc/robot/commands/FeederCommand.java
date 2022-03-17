package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FeederSubsystem;

public class FeederCommand extends CommandBase {
    private FeederSubsystem Feeder;
    private boolean InFeed;
    private boolean OutFeed;

    public FeederCommand(FeederSubsystem feeder, boolean infeed, boolean outfeed){
        this.Feeder = feeder;
        this.InFeed = infeed;
        this.OutFeed = outfeed;
        addRequirements(feeder);
    }

    @Override
    public void initialize(){
    }

    @Override
    public void execute(){
        if (InFeed == true){
            Feeder.feeding();
        }
        else if (OutFeed == true){
            Feeder.recalling();
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