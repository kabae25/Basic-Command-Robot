// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.FlyWheelSubsystem;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class flyRevCmd extends CommandBase {

  // Local instance variables
  private final FlyWheelSubsystem flyWheelSubsystem; // referencing the drive subsystem class
  private double flyRevSpeed;

  // Constructor for Drive command (called when you create an instance of the command)
  // pass in reference subsystem, and flywheel speed value
  public flyRevCmd(FlyWheelSubsystem flyWheelSubsystem, double flyRevSpeed) { //telling the command where to go to get the speed values

    this.flyWheelSubsystem = flyWheelSubsystem; // assigning values to be used from where ever the command is called 
    this.flyRevSpeed = flyRevSpeed; //assign values from method to class

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(flyWheelSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  System.out.println("Fly Wheel Rev Command Initiated");

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    flyWheelSubsystem.flyWheel.set(flyRevSpeed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    System.out.println("Fly Wheel Rev Command Ended");
    return true;
  }
}
