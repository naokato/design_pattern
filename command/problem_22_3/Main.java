import command.*;
import drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Client
// Invoker
public class Main extends JFrame {
  private MacroCommand history = new MacroCommand();
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  private JButton clearButton = new JButton("clear");

  public Main(String title) {
    super(title);

    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    canvas.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
      }

    });

    clearButton.addActionListener(e -> {
      history.clear();
      canvas.repaint();
    });

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(clearButton);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Main("Command Pattern Sample");
  }
}
