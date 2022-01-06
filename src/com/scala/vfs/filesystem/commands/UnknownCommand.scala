package com.scala.vfs.filesystem.commands

import com.scala.vfs.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State =
    state.setMessage("Command not found!")
}
