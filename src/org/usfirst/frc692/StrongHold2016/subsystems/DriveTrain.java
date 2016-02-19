// RobotBuilder Version: 1.5
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

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftSpeedControllerOne = RobotMap.driveTrainleftSpeedControllerOne;
    private final SpeedController rightSpeedControllerOne = RobotMap.driveTrainrightSpeedControllerOne;
    private final SpeedController rightSpeedControllerTwo = RobotMap.driveTrainrightSpeedControllerTwo;
    private final SpeedController leftSpeedControllerTwo = RobotMap.driveTrainleftSpeedControllerTwo;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
    	this.setDefaultCommand(new DriveWithTwoJoysticks());
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driveTrainMotorsForward()
    {
        robotDrive.drive(1, 0); //i switched the number from 0 to 1 ND
    }
    //sets victors to full power, causing the robot to go forward
    //KK 1/11/16
    
    public void driveTrainMotorsStop()
    {
        robotDrive.drive(0, 0);
    }
    //sets motors to neutral, making the robot stop
    //KK 1/11/16
    
    public void takeJoystickAxisValues(double LeftDrive, double RightDrive)
    {
        robotDrive.tankDrive(LeftDrive, RightDrive);
    }
}

