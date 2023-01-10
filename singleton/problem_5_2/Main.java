public class Main {
  public static void main(String[] args) {
    Triple alpha = Triple.getInstance("ALPHA");
    Triple beta = Triple.getInstance("BETA");
    Triple gamma = Triple.getInstance("GAMMA");

    System.out.println(alpha.getName());
    System.out.println(beta.getName());
    System.out.println(gamma.getName());
    
     System.out.println(Triple.getInstance("ALPHA") == Triple.getInstance("ALPHA"));
     System.out.println(Triple.getInstance("BETA") == Triple.getInstance("BETA"));
     System.out.println(Triple.getInstance("GAMMA") == Triple.getInstance("GAMMA"));
  }
}
