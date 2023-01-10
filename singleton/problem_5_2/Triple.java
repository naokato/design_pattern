import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

//public class Triple {
//  private String name;
//  private static Map<String, Triple> map = new HashMap<>();
//  static {
//    String[] names = {"ALPHA", "BETA", "GAMMA"};
//    Arrays.stream(names).forEach(name -> map.put(name, new Triple(name)));
//  }
//
//  private Triple(String name) {
//    this.name = name;
//  }
//
//  public static Triple getInstance(String name) {
//    return map.get(name);
//  }
//
//  public String getName() {
//    return name;
//  }
//}


public enum Triple {
  ALPHA, BETA, GAMMA;

  private Triple() {
    System.out.println("Triple instance " + this + " is created");
  }

  public static Triple getInstance(String name) {
    return valueOf(name);
  }

  public String getName() {
    return this.toString();
  }
}
