package com.scala.vfs.filesystem.commands

import com.scala.vfs.filesystem.State

trait Command {

  def apply(state: State): State
}

object Command {
  def from(input: String): Command =
    new UnknownCommand
}
