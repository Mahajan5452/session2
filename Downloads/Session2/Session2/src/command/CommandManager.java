package command;

import java.util.Stack;

public class CommandManager {
  private Stack<Command> commandHistory = new Stack<>();

  public void executeCommand(Command command) {
    command.execute();
    commandHistory.push(command);
  }

  public void undo() {
    if (!commandHistory.isEmpty()) {
      Command command = commandHistory.pop();
      command.undo();
    }
  }
}

