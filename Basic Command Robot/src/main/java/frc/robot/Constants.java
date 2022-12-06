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
    public static final int leftMotor1ID = 1;
    public static final int leftMotor2ID = 2;
    public static final int rightMotor1ID = 3;
    public static final int rightMotor2ID = 4;

    // Fly Wheel
    public static final int flyWheelID = 6; // CAN ID for Neo SparkMax

    /** Drive Train Constants **/
    public static final double drivingLinearSpeedSensitivity = 0.8;
    public static final double drivingTurnSpeedSensitivity = 0.8;

    public static final double driveFilterLinearROC = 1.5; //Primitive Motion profile ROC for linear speed while driving
    public static final double driveFilterTurnROC = 0.5; // Primitive Motion profile ROC for turning while driving
    /** Fly Wheel Constants **/ 
    public static final double flyIdleSpeed = 0.02;
    public static final double flyRevSpeed = 0.5;

    public static final int controllerPort = 1;
    public static final double rumble = 0.5;

    

}
