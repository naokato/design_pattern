// Proxy
public class PrinterProxy implements Printable {
  private String name;
  private String printableClassName;
  private Printable real;

  public PrinterProxy(String name, String printableClassName) {
    this.name = name;
    this.printableClassName = printableClassName;
    this.real = null;
  }

  @Override
  public synchronized void setPrinterName(String name) {
    if (real != null) {
      real.setPrinterName(name);
    }
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return name;
  }
  
  @Override
  public void print(String string) {
    realize();
    real.print(string);
  }

  private synchronized void realize() {
    if (real == null) {
      try {
        real = (Printable) Class.forName(printableClassName).getDeclaredConstructor().newInstance();
        real.setPrinterName(name);
      } catch (ClassNotFoundException e) {
        System.out.println(printableClassName + " が見つかりません");
        throw new RuntimeException("realize error");
      } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("realize error");
      }
    }
  }
}
