// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class DriveSubsystem extends SubsystemBase {
  //define what DriveSubsystem has
  
  WPI_VictorSPX leftMotor1 = new WPI_VictorSPX(Constants.leftMotor1ID); //initialize leftMotor1 as a Victor SPX
  WPI_VictorSPX leftMotor2 = new WPI_VictorSPX(Constants.leftMotor2ID); //initialize leftMotor2 as a Victor SPX
  WPI_VictorSPX rightMotor1 = new WPI_VictorSPX(Constants.rightMotor1ID); //initialize rightMotor1 as a Victor SPX
  WPI_VictorSPX rightMotor2 = new WPI_VictorSPX(Constants.rightMotor2ID); //initialize rightMotor2 as a Victor SPX

  
  MotorControllerGroup right = new MotorControllerGroup(rightMotor1, rightMotor2); //right motor 
  MotorControllerGroup left = new MotorControllerGroup(leftMotor1, leftMotor2);

  public DifferentialDrive drivetrain = new DifferentialDrive(left, right);
  


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
    //SmartDashboard.putData("Left Drive Train Raw Speed", this.);


  }



}
