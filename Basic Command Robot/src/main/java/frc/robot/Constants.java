// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    /** CAN IDs */
    // Drive Train
    public static int leftMotor1ID = 1;
    public static int leftMotor2ID = 2;
    public static int rightMotor1ID = 3;
    public static int rightMotor2ID = 4;

    // Fly Wheel
    public static int flyWheelID = 6;

    /** Drive Train Constants **/
    public static double linearSpeedSensitivity = 0.8;
    public static double rotationSpeedSensitivity = 0.8;

    /** Fly Wheel Constants **/ 
    public static double flyIdleSpeed = 0.05;
    public static double flyRevSpeed = 0.5;


}
