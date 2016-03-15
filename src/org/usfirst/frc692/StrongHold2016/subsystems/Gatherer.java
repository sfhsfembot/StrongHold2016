// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.StrongHold2016.subsystems;

import org.usfirst.frc692.StrongHold2016.RobotMap;
import org.usfirst.frc692.StrongHold2016.commands.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Gatherer extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController gathererMotor = RobotMap.gatherergathererMotor;
    private final SpeedController gathererArmLiftMotor = RobotMap.gatherergathererArmLiftMotor;
    private final DigitalInput limitSwitchUp = RobotMap.gathererlimitSwitchUp;
    private final DigitalInput limitSwitchDown = RobotMap.gathererlimitSwitchDown;
    private final DigitalInput limitSwitchGathererIn = RobotMap.gathererlimitSwitchGathererIn;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static ArmPositions armPosition = ArmPositions.Up; 
    		
    public enum ArmPositions
    {
    	Unknown,
    	Up,
    	Down,
    	Neutral
    	}
    // added enumeration to provide exact states for limit switches
    // AO 2/12/16

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        setDefaultCommand(new GathererArmOperator());
    }
    
    public void gatherIn()
    {
    	gathererMotor.set(1.0);
    }
    // Gatherer track moves 100% forward when button is pressed
    // AO 2/6/16
    
    public void gatherOut()
    {
    	gathererMotor.set(-1.0);
    }
    // Gather track moves 100% backwards when button is pressed
    
    public void gathererStop()
    {
    	gathererMotor.set(0.0);
    }
    // Gather emergency stop
    // AO 2/6/16
    
    public void armLift()
    {
    	this.gathererArmLiftMotor.set(0.5);
    }
    // Lifts gatherer arm up
    // AO 2/6/16
    public void armLiftContinuoslyUp()
    {
    	gathererArmLiftMotor.set(0.1);
    }
    
    public void armLiftContinuoslyDown()
    {
    	gathererArmLiftMotor.set(-0.1);
    }
    /*
   public void armMiddle()
    {
    	if(armPosition == ArmPositions.Up)
    	{
    		this.armDown();
    	}	
    	else if(armPosition == ArmPositions.Down)
    	{	
    		this.armlift();
    	}    		
    }
    */
    
    public void armDown()
    {
    	this.gathererArmLiftMotor.set(-0.5);
    }
    // drops gather arm 
    // AO 2/6/16
    
    public ArmPositions gathererArmLift()
    {
    	ArmPositions position = ArmPositions.Unknown;
    			
    	if(limitSwitchUp.get() == true)
    	{
    		position = ArmPositions.Up;
    		SmartDashboard.putString("Gatherer Arm Up:", "true");
    	}	
    	else if(limitSwitchDown.get() == true)
    	{
    		position = ArmPositions.Down;
    		SmartDashboard.putString("Gatherer Arm Down:", "true");
    	}
    	
    	/*
    	else if(limitSwitchMiddle.get() == true)
    	{
    		position = ArmPositions.Middle;
    		SmartDashboard.putString("Gatherer Arm Middle:", "true");
    	}	
    	*/
    	
    	else
    	{
    		SmartDashboard.putString("Gatherer unknown:", "false");
    	}
    	return position;
    }
    // smart dash board prints out false if limit switches are not pushed
    // KK 2/20/16
    	
    public void setGathererArmLiftMotor(double speed){
    	this.gathererArmLiftMotor.set(speed);
    }

    public DigitalInput getLimitSwitchUp() {
		return limitSwitchUp;
	}

	public DigitalInput getLimitSwitchDown() {
		return limitSwitchDown;
	}

	public DigitalInput getLimitSwitchGathererIn() {
		return limitSwitchGathererIn;
	}


}
    	

