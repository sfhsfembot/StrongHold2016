// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.StrongHold2016;

import org.usfirst.frc692.StrongHold2016.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton mainCameraButtonOne;
    public JoystickButton secondaryCameraButtonTwo;
    public JoystickButton gathererArmUpButtonFour;
    public JoystickButton gathererArmDownButtonFive;
    public JoystickButton gatherOutButtonSix;
    public JoystickButton gatherInButtonTen;
    public JoystickButton emergencyStopButtonEleven;
    public JoystickButton scalerReleaseButtonTwelve;
    public Joystick operatorJoystick;
    public JoystickButton emergencyStopButtonThree;
    public Joystick leftJoystick;
    public Joystick rightJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(0);
        
        leftJoystick = new Joystick(1);
        
        emergencyStopButtonThree = new JoystickButton(leftJoystick, 3);
        emergencyStopButtonThree.whenPressed(new EmergencyStop());
        operatorJoystick = new Joystick(2);
        
        scalerReleaseButtonTwelve = new JoystickButton(operatorJoystick, 12);
        scalerReleaseButtonTwelve.whileHeld(new ScalerRelase());
        emergencyStopButtonEleven = new JoystickButton(operatorJoystick, 11);
        emergencyStopButtonEleven.whenPressed(new EmergencyStop());
        gatherInButtonTen = new JoystickButton(operatorJoystick, 10);
        gatherInButtonTen.whileHeld(new GatherMotorIn());
        gatherOutButtonSix = new JoystickButton(operatorJoystick, 6);
        gatherOutButtonSix.whileHeld(new GatherMotorOut());
        gathererArmDownButtonFive = new JoystickButton(operatorJoystick, 5);
        gathererArmDownButtonFive.whileHeld(new GathererArmDown());
        gathererArmUpButtonFour = new JoystickButton(operatorJoystick, 4);
        gathererArmUpButtonFour.whileHeld(new GathererArmUp());
        secondaryCameraButtonTwo = new JoystickButton(operatorJoystick, 2);
        secondaryCameraButtonTwo.whenPressed(new ShowSecondaryCamera());
        mainCameraButtonOne = new JoystickButton(operatorJoystick, 1);
        mainCameraButtonOne.whenPressed(new ShowMainCamera());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveWithTwoJoysticks", new DriveWithTwoJoysticks());
        SmartDashboard.putData("ShowMainCamera", new ShowMainCamera());
        SmartDashboard.putData("ShowSecondaryCamera", new ShowSecondaryCamera());
        SmartDashboard.putData("GatherMotorIn", new GatherMotorIn());
        SmartDashboard.putData("GatherMotorOut", new GatherMotorOut());
        SmartDashboard.putData("GathererStop", new GathererStop());
        SmartDashboard.putData("EmergencyStop", new EmergencyStop());
        SmartDashboard.putData("AutonMoveForward", new AutonMoveForward());
        SmartDashboard.putData("OperatorJoystickValue", new OperatorJoystickValue());
        SmartDashboard.putData("GathererArmUp", new GathererArmUp());
        SmartDashboard.putData("GathererArmDown", new GathererArmDown());
        SmartDashboard.putData("ScalerRelase", new ScalerRelase());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        SmartDashboard.putNumber("rightJoystick", rightJoystick.getX());
        SmartDashboard.putNumber("leftJoystick", leftJoystick.getX());
    }
    
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getOperatorJoystick() {
        return operatorJoystick;
    }

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

