import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      usage();
      System.exit(0);
    }
    
    String docType = args[0];

    if (docType.equals("text")) {
      TextBuilder textBuilder = new TextBuilder();
      Director director = new Director(textBuilder);
      director.construct();
      String result = textBuilder.getTextResult();
      System.out.println(result);
      return;
    }
    
    if (docType.equals("html")) {
      HtmlBuilder htmlBuilder =  new HtmlBuilder();
      Director director = new Director(htmlBuilder);
      director.construct();
      String result = htmlBuilder.getHtmlResult();
      System.out.println(result);
      return;
    }

    usage();
    System.exit(0);
  }

  private static void usage() {
    System.out.println("Usage: java Main text   テキストで文書作成");
    System.out.println("Usage: java Main html   html で文書作成");
  }
}
