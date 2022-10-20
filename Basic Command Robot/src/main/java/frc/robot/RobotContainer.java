// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.ResourceBundle.Control;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCmd;
import frc.robot.commands.flyIdleCmd;
import frc.robot.commands.flyRevCmd;
import frc.robot.commands.rumbleCmd;
import frc.robot.subsystems.ControlSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.FlyWheelSubsystem;
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



  
  /** Create the container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();


    // Set default commands for each subsystem
    driveSubsystem.setDefaultCommand(new DriveCmd(driveSubsystem,() -> joy1.getLeftY() * Constants.linearSpeedSensitivity, () -> joy1.getRightX() * Constants.rotationSpeedSensitivity)); //default command is drive with joystick inputs
    flyWheelSubsystem.setDefaultCommand(new flyIdleCmd(flyWheelSubsystem)); //default command is run motor at 0.2 (in constants)
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    new JoystickButton(joy1, XboxController.Button.kX.value).whileActiveOnce(new flyRevCmd(flyWheelSubsystem, Constants.flyRevSpeed));
    new JoystickButton(joy1, XboxController.Button.kX.value).whileActiveOnce(new rumbleCmd(controlSubsystem, Constants.rumble)); // Init a new JoystickButton as trigger for command, then pass xbox controller & assigned button as condition. When pressed once, execute the flywheel rev cmd

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