package command;

import java.util.ArrayDeque;
import java.util.Deque;

// Concrete Command
public class MacroCommand implements Command {
  private Deque<Command> commands = new ArrayDeque<>();

  @Override
  public void execute() {
    for (Command command: commands) {
      command.execute();
    }
  }

  public void append(Command command) {
    if (command == this) {
      throw new IllegalArgumentException("infinite loop caused by append");
    }
    commands.push(command);
  }

  public void undo() {
    if (!commands.isEmpty()) {
      commands.pop();
    }
  }

  public void clear() {
    commands.clear();
  }
}
