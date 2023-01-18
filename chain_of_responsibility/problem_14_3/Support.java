// Handler
public abstract class Support {
  private String name;
  private Support next;

  public Support(String name) {
    this.name = name;
    this.next = null;
  }

  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  public void support(Trouble trouble) {
    Support currentSupport = this;

    while (true) {
      if (currentSupport.resolve(trouble)) {
        currentSupport.done(trouble);
        break;
      } else if (currentSupport.next == null) {
        currentSupport.fail(trouble);
        break;
      } else {
        currentSupport = currentSupport.next;
      }
    }
  }

  @Override
  public String toString() {
    return "[" + name + "]";
  }

  protected abstract boolean resolve(Trouble trouble);

  protected void done(Trouble trouble) {
    System.out.println(trouble + " is resolved by " + this + ".");
  }

  protected void fail(Trouble trouble) {
    System.out.println(trouble + " cannot be resolved.");
  }
}
