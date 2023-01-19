public class Main {
  public static void main(String[] args) {
    String title = "Welcome!";
    String message = "Hello, world!";
    // text block
    String html = """
    <!DOCTYPE html>
    <html>
      <head>
        <title>%s</title>
      </head>
      <body>
        <h1 style="text-align: center">%s""</h1>
      </body>
    </html>
    """.formatted(title, message);
    System.out.printf(html);
  }
}
