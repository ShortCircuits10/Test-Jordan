// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
import frc.robot.subZero.commandsfolder.*;
import frc.libs.*;

public class OI {
    public XboxController driver;


        public OI() {
            driver = new XboxController(0);  
            
            driver.B.whileHeld(new shooterRotate());
            driver.X.whileHeld(new disableShooter());
        
        }
}
