// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DriveCmd extends CommandBase {

  // Local instance variables
  private final DriveSubsystem driveSubsystem; // referencing the drive subsystem class
  private Supplier<Double> linearSpeed;
  private Supplier<Double> turnSpeed;

  // Constructor for Drive command (called when you create an instance of the command)
  // pass in reference subsystem, and speed value
  public DriveCmd(DriveSubsystem driveSubsystem, Supplier<Double> linearSpeed, Supplier<Double> turnSpeed) { //telling the command where to go to get the speed values


    this.driveSubsystem = driveSubsystem; // assigning values to be used from where ever the command is called 
    this.linearSpeed = linearSpeed; // speed variable is equal to what ever is provided in the command call
    this.turnSpeed = turnSpeed;


    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Drive Command Initialized"); // print to log that the command started

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    driveSubsystem.drivetrain.arcadeDrive(linearSpeed.get() * Constants.linearSpeedSensitivity, turnSpeed.get() * Constants.rotationSpeedSensitivity);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("Drive Command Stopped"); // print to log that the command stopped
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
