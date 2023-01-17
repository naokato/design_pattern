public class Main {
  public static void main(String[] args) {
    Directory rootdir = new Directory("root");
    Directory bindir = new Directory("bin");
    Directory tempdir = new Directory("tmp");
    Directory usrdir = new Directory("usr");
    rootdir.add(bindir)
      .add(tempdir)
      .add(usrdir);
    bindir.add(new File("vi", 10000))
      .add(new File("latex", 20000));

    Directory yuki = new Directory("yuki");
    Directory hanako = new Directory("hanako");
    Directory tomura = new Directory("tomura");
    usrdir.add(yuki)
      .add(hanako)
      .add(tomura);

    yuki.add(new File("diary.html", 100))
      .add(new File("tameshi.html", 100))
      .add(new File("Composite.java", 200));
    hanako.add(new File("memo.tex", 300));
    tomura.add(new File("game.doc", 400))
      .add(new File("junk.mail", 500));
    
    rootdir.accept(new ListVisitor());

    FileFindVisitor ffv = new FileFindVisitor(".html");
    rootdir.accept(ffv);

    System.out.println("HTML files are:");
    for (File file: ffv.getFoundFiles()) {
      System.out.println(file);
    }
  }
}
