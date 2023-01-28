package drawer;

import command.Command;

public class UndoCommand implements Command {
  private Drawable drawable;

  public UndoCommand(Drawable drawable) {
    this.drawable = drawable;
  }

  @Override
  public void execute() {
    drawable.undo();
  }
}
