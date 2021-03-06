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

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Scaler extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController scalerMotor = RobotMap.scalerscalerMotor;
    private final Relay scalerRelease = RobotMap.scalerscalerRelease;
    private final Encoder scalerEncoder = RobotMap.scalerscalerEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void scalerMotorForward()
    {
    	scalerMotor.set(1.0);
    }
    // when pressed scaler moves up 100% power
    // KK 2/20/16
    
    public void scalerStop()
    {
    	scalerMotor.set(0.0);
    }
    // when nothing is pressed the scaler does not move
    // KK 2/20/16
    
    
    public void scalerMotorReverse()
    {
    	// scalerMotor.set(-1.0);
    }
    
    public void scalerRelease()
    {
    	
    }
    
    public void releaseScaler()
    {
    	// scalerRelease.set(Value.kReverse);
    } 
    
    public void resetScalerEncoder() {
    	// scalerEncoder.reset();
    }
    
    public int getScalerEncoderCount() {
    	return scalerEncoder.get();
    }
    
    public boolean getEncoderDirection() {
    	if (scalerEncoder.getDirection() == true)
    		return true;
    	else
    		return false;
    }
    
    public double getScalerEncoderDistance() {
    	return scalerEncoder.getDistance();
    }
    
    public double getLeftFrontEncoderRate() {
    	return scalerEncoder.getRate();
    }
    
    public boolean scalerEncodersStopCounting() {
    	if (scalerEncoder.getStopped()) 
    		return true; 
    	else 
    		return false; 
    }
    
}

