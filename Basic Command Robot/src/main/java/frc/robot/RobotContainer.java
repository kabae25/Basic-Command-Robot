// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  
  // Create Instances of robot subsystems
  public final DriveSubsystem driveSubsystem = new DriveSubsystem();
  public final FlyWheelSubsystem flyWheelSubsystem = new FlyWheelSubsystem();
  public final ControlSubsystem controlSubsystem = new ControlSubsystem();

  // Create instance of a joystick controller
  public XboxController joy1 = new XboxController(Constants.controllerPort);

  // Creates a SlewRateLimiter that limits the rate of change of the signal to 0.2 units per second
  SlewRateLimiter filter = new SlewRateLimiter(Constants.driveFilterLinearROC);
  SlewRateLimiter driveFilter = new SlewRateLimiter(Constants.driveFilterTurnROC);

  
  /** Create the container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    // Call method to configure the button bindings
    configureButtonBindings();


    /* Set default commands for each subsystem */
    //default command is drive with joystick inputs
    driveSubsystem.setDefaultCommand(new DriveCmd(driveSubsystem,() -> filter.calculate(joy1.getLeftY()) * Constants.drivingLinearSpeedSensitivity,() -> joy1.getRightX() * Constants.drivingTurnSpeedSensitivity));  //lambda () -> used to allow function as a parameter in the method call
    flyWheelSubsystem.setDefaultCommand(new FlyIdleCmd(flyWheelSubsystem)); //default command is run motor at 0.2 (in constants)
  }


  //Button Mapping Method
  private void configureButtonBindings() {

    new JoystickButton(joy1, XboxController.Button.kX.value).whileActiveOnce(new FlyRevCmd(flyWheelSubsystem, driveFilter.calculate(Constants.flyRevSpeed)));
    new JoystickButton(joy1, XboxController.Button.kX.value).whileActiveOnce(new ControllerRumbleCmd(controlSubsystem, Constants.rumble)); // Init a new JoystickButton as trigger for command, then pass xbox controller & assigned button as condition. When pressed once, execute the flywheel rev cmd

  }


  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
}