// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.StrongHold2016.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc692.StrongHold2016.Robot;
import org.usfirst.frc692.StrongHold2016.RobotMap;
import org.usfirst.frc692.StrongHold2016.subsystems.Gatherer;

/**
 *
 */
public class GathererArmDown extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public GathererArmDown() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.gatherer);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	Gatherer.armPosition = Gatherer.ArmPositions.Down;
    }
    // asking for robot arm to move down
    // KK 2/20/16

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(! RobotMap.gathererlimitSwitchDown.get()){
//    		Robot.gatherer.armDown();
//    	}
//    	else
//    	{
//    		Robot.gatherer.armLiftContinuoslyDown();
//    	}
    	// continues to move down if not pressed
    	// KK 2/20/16
    }


    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// returns true or false based on the value of the switch
//        if(Gatherer.armPosition == Gatherer.ArmPositions.Up){
//    		return true;
//    	}
//    	else if(Gatherer.armPosition == Gatherer.ArmPositions.Neutral)
//    	{
//    		return true;
//    	}
    	return false; 	
    }
   

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
