// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or sharehttps://software-metadata.revrobotics.com/REVLib.json it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants;
import frc.robot.RobotContainer;



public class FlyWheelSubsystem extends SubsystemBase {
  //define what DriveSubsystem has
  public CANSparkMax flyWheel = new CANSparkMax(Constants.flyWheelID, MotorType.kBrushless);


  /** Creates a new Drive Subsystem. */
  public FlyWheelSubsystem() { 
      // initialize when driveSubsystem is created
      System.out.println("Fly Wheel Subsystem Initialized");
    }

  




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //SmartDashboard.putData("Left Drive Train Raw Speed", this.);


  }



}
