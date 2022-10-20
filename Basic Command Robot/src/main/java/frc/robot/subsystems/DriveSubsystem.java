// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
//import frc.robot.RobotContainer;


public class DriveSubsystem extends SubsystemBase {
  //define what DriveSubsystem has
  
  /* for CIM & Victor */
  
  WPI_VictorSPX leftMotor1 = new WPI_VictorSPX(Constants.leftMotor1ID); //initialize leftMotor1 as a Victor SPX
  WPI_VictorSPX leftMotor2 = new WPI_VictorSPX(Constants.leftMotor2ID); //initialize leftMotor2 as a Victor SPX
  WPI_VictorSPX rightMotor1 = new WPI_VictorSPX(Constants.rightMotor1ID); //initialize rightMotor1 as a Victor SPX
  WPI_VictorSPX rightMotor2 = new WPI_VictorSPX(Constants.rightMotor2ID); //initialize rightMotor2 as a Victor SPX
    
  MotorControllerGroup right = new MotorControllerGroup(rightMotor1, rightMotor2); //right motor control group
  MotorControllerGroup left = new MotorControllerGroup(leftMotor1, leftMotor2); //left motor control group

  public DifferentialDrive drivetrain = new DifferentialDrive(left, right); //define drive train

  /* For Falcon 500 */
  /*
  TalonSRX leftFalcon1 = new TalonSRX(1);
  TalonSRX leftFalcon2 = new TalonSRX(2);
  TalonSRX leftFalcon3 = new TalonSRX(3);
  TalonSRX rightFalcon1 = new TalonSRX(4);
  TalonSRX rightFalcon2 = new TalonSRX(5);
  TalonSRX rightFalcon3 = new TalonSRX(6);
  
  MotorControllerGroup leftFalcons = new MotorControllerGroup(leftFalcon1, leftFalcon2, leftFalcon3);
  MotorControllerGroup rightFalcons = new MotorControllerGroup(rightFalcon1, rightFalcon2, rightFalcon3);

  public DifferentialDrive drivetrain = new DifferentialDrive(leftFalcons, rightFalcons);
  */



  /** Creates a new Drive Subsystem. */
  public DriveSubsystem() { 
      // initialize when driveSubsystem is created
      rightMotor1.setInverted(true); 
      rightMotor2.setInverted(true);


      System.out.println("Drive Subsystem Initialized");
    }

  




  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // Display Motor info on SmartDashboard
    SmartDashboard.putData("Left Motor 1", leftMotor1);
    SmartDashboard.putData("Left Motor 2", leftMotor2);
    SmartDashboard.putData("Right Motor 1", rightMotor1);
    SmartDashboard.putData("Right Motor 2", rightMotor2);

  }



}
