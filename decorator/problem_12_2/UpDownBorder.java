public class UpDownBorder extends Border {
  private char borderCh;

  public UpDownBorder(Display display, char ch) {
    super(display);
    this.borderCh = ch;
  }

  @Override
  public int getColumns() {
    return display.getColumns();
  }

  @Override
  public int getRows() {
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0) {
      return makeLine(borderCh, getColumns());
    } else if (row == display.getRows() + 1) {
      return makeLine(borderCh, getColumns());
    } else {
      return display.getRowText(row - 1);
    }
  }
  
  private String makeLine(char ch, int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(ch);
    }
    return sb.toString();
  }
}
