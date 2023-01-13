public class MarkdownBuilder extends Builder {
  private StringBuilder sb = new StringBuilder();
  
  @Override
  public void makeTitle(String title) {
    sb.append("# " + title + "\n\n");
  }

  @Override
  public void makeString(String str) {
    sb.append(str + "\n");
  }

  @Override
  public void makeItems(String[] items) {
    for (String item: items) {
      sb.append("- " + item + "\n");
    }
    sb.append("\n");
  }

  @Override
  public void close() {
  }

  public String getMarkdownResult() {
    return sb.toString();
  }
}
