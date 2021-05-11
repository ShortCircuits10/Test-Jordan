// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subZero;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.*;
import frc.robot.subZero.commandsfolder.disableShooter;
/** Add your docs here. */
public class SubShoot extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX jj;

  public SubShoot() {

    jj = new WPI_TalonSRX(robotMap.JJ);

  }
  public void setSpeed (double speed) {
    jj.set(speed);
  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new disableShooter());
  }
}
