// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;



public class FlyWheelSubsystem extends SubsystemBase {
  //define what DriveSubsystem has
  public Spark flyWheel = new Spark(Constants.flyWheelID);


  /** Creates a new Drive Subsystem. */
  public FlyWheelSubsystem() { 
      // initialize when driveSubsystem is created
    
    }

  




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //SmartDashboard.putData("Left Drive Train Raw Speed", this.);


  }



}
