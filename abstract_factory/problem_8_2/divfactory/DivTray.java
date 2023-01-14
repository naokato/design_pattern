package divfactory;

import factory.Tray;
import factory.Item;

public class DivTray extends Tray {
  public DivTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<p><b>");
    sb.append(caption);
    sb.append("</b></p>\n");
    sb.append("<div class=\"TRAY\">\n");
    for (Item item: tray) {
      sb.append(item.makeHTML());
    }
    sb.append("</div>\n");

    return sb.toString();
  }
}