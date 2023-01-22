import game.Memento;
import game.Gamer;
import java.nio.file.Files;
import java.nio.file.Path;

// Caretaker
public class Main {
  private static final String SAVE_FILE_NAME = "./game.dat";

  public static void main(String[] args) {
    Gamer gamer = new Gamer(100);

    // if save data exists, load it
    Memento memento = Memento.loadFromFile(SAVE_FILE_NAME);
    if (memento == null) {
      System.out.println("新規にゲームを始めます");
      memento = gamer.createMemento();
    } else {
      System.out.println("既存データをロードしてゲームを始めます");
      gamer.restoreMemento(memento);
    }

    for (int i = 0; i < 100; i++) {
      System.out.println("==== " + i);
      System.out.println("現状:" + gamer);

      gamer.bet();

      System.out.println("所持金は" + gamer.getMoney() + "円になりました");

      if (gamer.getMoney() > memento.getMoney()) {
        System.out.println("※だいぶ増えたので、現在の状態を保存しておこう");
        memento = gamer.createMemento();
        if (Memento.saveToFile(SAVE_FILE_NAME, memento)) {
          System.out.println("データをファイルに記録しました");
        } else {
          System.out.println("データのファイルへの保存に失敗しました");
        }
      } else if (gamer.getMoney() < memento.getMoney() / 2) {
        System.out.println("※だいぶ減ったので、以前の状態を復元しよう");
        gamer.restoreMemento(memento);
      }

      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {

      }
    }
  }
}
