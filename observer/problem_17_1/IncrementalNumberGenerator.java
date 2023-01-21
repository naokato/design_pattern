public class IncrementalNumberGenerator extends NumberGenerator {
  private int number;
  private int start;
  private int end;
  private int increment;

  public IncrementalNumberGenerator(int start, int end, int increment) {
    this.start = start;
    this.end = end;
    this.increment = increment;
  }

  @Override
  public int getNumber() {
    return number;
  }

  @Override
  public void execute() {
    for (int i = start ; i < end; i += increment) {
      number = i;
      notifyObservers();
    }
  }
}
