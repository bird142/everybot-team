// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/** Add your docs here. */
public class Robot extends TimedRobot {
    private Command m_teleopCommand;
    private RobotContainer m_container;

    @Override
    public void robotInit() {
        m_container = new RobotContainer();
    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        m_teleopCommand = m_container.getTeleopCommand();
        if (m_teleopCommand != null)
            m_teleopCommand.schedule();
    }

}
