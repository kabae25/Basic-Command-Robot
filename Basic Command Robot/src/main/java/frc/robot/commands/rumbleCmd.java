// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ControlSubsystem;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.RobotContainer; // Unclear if this is necessary

/** An example command that uses an example subsystem. */
public class rumbleCmd extends CommandBase {

  // Local instance variables
  private final ControlSubsystem controlSubsystem; // referencing the drive subsystem class
  private double rumble;

  // Constructor for Drive command (called when you create an instance of the command)
  // pass in reference subsystem, and flywheel speed value
  public rumbleCmd(ControlSubsystem controlSubsystem, double rumble) { //telling the command where to go to get the speed values

    this.controlSubsystem = controlSubsystem; // assigning values to be used from where ever the command is called 
    this.rumble = rumble;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(controlSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  System.out.println("Controller Rumble Command Initiated");

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    controlSubsystem.joy1.setRumble(RumbleType.kRightRumble,rumble);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("Fly Wheel Rev Command Ended");
    controlSubsystem.joy1.setRumble(RumbleType.kRightRumble,0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
