// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
//import frc.robot.RobotContainer;


public class ControlSubsystem extends SubsystemBase {
  //define what DriveSubsystem has
  public XboxController joy1 = new XboxController(Constants.controllerPort);


  /** Creates a new Drive Subsystem. */
  public ControlSubsystem() { 
      // initialize when driveSubsystem is created
      System.out.println("Control Subsystem Initialized");
    }

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}