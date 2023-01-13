public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeTitle("My Home Page");
    builder.makeString("Members");
    builder.makeItems(new String[] {
      "Tanaka",
      "Sato",
      "Yamada",
      "Sato"
    });
    builder.makeString("What's new");
    builder.makeItems(new String[] {
      "2022/01/01 ....",
      "2022/02/01 ....",
      "2022/03/01 ....",
      "2023/01/01 ....",
    });
    builder.close();
  }
}
