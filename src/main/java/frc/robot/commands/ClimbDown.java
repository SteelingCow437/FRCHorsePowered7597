// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;

public class ClimbDown extends Command {
  /** Creates a new ClimbDown. */
  ClimbSubsystem m_ClimbSubsystem;
  public ClimbDown(ClimbSubsystem m_ClimbSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_ClimbSubsystem = m_ClimbSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_ClimbSubsystem.setRetract();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
