public class StringDisplay extends Display {
  private String string;

  public StringDisplay(String string) {
    this.string = string;
  }

  @Override
  public int getColumns() {
    return string.length();
  }

  @Override
  public int getRows() {
    return 1;
  }

  @Override
  public String getRowText(int row) {
    if (row != 0) {
      throw new IndexOutOfBoundsException();
    }
    return string;
  }
  
  // public static void main(String[] args) {
  //   Display display = new StringDisplay("naokato");
  //   System.out.println(display.getColumns());
  //   System.out.println(display.getRows());
  //   System.out.println(display.getRowText(1));
  // }
}
