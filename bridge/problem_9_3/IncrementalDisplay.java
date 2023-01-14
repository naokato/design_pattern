public class IncrementalDisplay extends CountDisplay {
  private int step;

  public IncrementalDisplay(DisplayImpl impl, int step) {
    super(impl);
    this.step = step;
  }

  public void incrementalDisplay(int times) {
    int count = 0;
    for (int i = 0; i < times; i++) {
      multiDisplay(count);
      count += step;
    }
  }
}
