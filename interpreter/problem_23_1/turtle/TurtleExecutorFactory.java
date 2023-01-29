package turtle;

import language.Executor;
import language.ExecutorFactory;

public class TurtleExecutorFactory implements ExecutorFactory {
  private final TurtleCanvas canvas;

  private class GoExecutor implements Executor {
    @Override
    public void execute() {
      canvas.go(TurtleCanvas.UNIT_LENGTH);
    }
  }

  private class LeftExecutor implements Executor {
    @Override
    public void execute() {
      canvas.setRelativeDirection(TurtleCanvas.RELATIVE_DIRECTION_LEFT);
    }
  }

  private class RightExecutor implements Executor {
    @Override
    public void execute() {
      canvas.setRelativeDirection(TurtleCanvas.RELATIVE_DIRECTION_RIGHT);
    }
  }

  public TurtleExecutorFactory(TurtleCanvas canvas) {
    this.canvas = canvas;
  }

  @Override
  public Executor createExecutor(String name) {
    if (name.equals("go")) {
      return new GoExecutor();
    } else if (name.equals("right")) {
      return new RightExecutor();
    } else if (name.equals("left")) {
      return new LeftExecutor();
    } else {
      throw new IllegalArgumentException("Error: Unknown <primitive command>: '" + name + "'");
    }
  }
}
