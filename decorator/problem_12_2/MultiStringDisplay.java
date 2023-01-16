import java.util.ArrayList;
import java.util.List;
;
public class MultiStringDisplay extends Display {
  private List<String> strings = new ArrayList<>();

  @Override
  public int getColumns() {
    // this may be slow when the size of the list is big.
    // we can improbe the performance by calculating the max size in add method.
    return strings.stream().mapToInt(string -> string.length()).max().orElse(0);
  }

  @Override
  public int getRows() {
    return strings.size(); 
  }

  @Override
  public String getRowText(int row) {
    // fill spaces to right end
    return String.format("%-" + getColumns() + "s", strings.get(row));
  }

  public MultiStringDisplay add(String string) {
    strings.add(string);
    return this;
  }

  //public static void main(String[] args) {
  //  MultiStringDisplay display = new MultiStringDisplay();
  //  display.add("naokato")
  //    .add("tanaka")
  //    .add("sato");
  //  System.out.println(display.getColumns());
  //  System.out.println(display.getRows());
  //  display.show();
  //}
}
