import java.util.*;

class Main {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("D", "B", "C", "B", "A");
    
    // 無名クラス
    // 辞書式順序で小さい順
    list.sort(
      new Comparator<String>() {
        public int compare(String a, String b) {
          return a.compareTo(b);
        }
      }
    );
    System.out.println(list);
    
    // 辞書式順序で大きい順
    list.sort(
      new Comparator<String>() {
        public int compare(String a, String b) {
          return b.compareTo(a);
        }
      }
    );
    System.out.println(list);

    // ラムダ式
    // Comparetor<> は唯一の抽象メソッドを持つ"関数型インタフェース"のため、ラムダ式を適用可能
    // 辞書式順序で小さい順
    list.sort((a, b) -> a.compareTo(b));
    System.out.println(list);
    
    // 辞書式順序で大きい順
    list.sort((a, b) -> b.compareTo(a));
    System.out.println(list);
  }
}
