import command.*;
import drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Client
// Invoker
public class Main extends JFrame implements MouseMotionListener, WindowListener {
  private MacroCommand history = new MacroCommand();
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  private JButton clearButton = new JButton("clear");
  private JButton blackButton = new JButton("black");
  private JButton redButton = new JButton("red");

  public Main(String title) {
    super(title);

    this.addWindowListener(this);
    canvas.addMouseMotionListener(this);
    clearButton.addActionListener(e -> {
      history.clear();
      canvas.repaint();
    });
    blackButton.addActionListener(e -> {
      Command cmd = new ColorCommand(canvas, Color.black);
      history.append(cmd);
      cmd.execute();
    });
    redButton.addActionListener(e -> {
      Command cmd = new ColorCommand(canvas, Color.red);
      history.append(cmd);
      cmd.execute();
    });

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(clearButton);
    buttonBox.add(blackButton);
    buttonBox.add(redButton);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    setVisible(true);
  }

  @Override
  public void mouseMoved(MouseEvent e) {
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Command cmd = new DrawCommand(canvas, e.getPoint());
    history.append(cmd);
    cmd.execute();
  }
  
  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  @Override public void windowActivated(WindowEvent e) {}
  @Override public void windowClosed(WindowEvent e) {}
  @Override public void windowDeactivated(WindowEvent e) {}
  @Override public void windowDeiconified(WindowEvent e) {}
  @Override public void windowIconified(WindowEvent e) {}
  @Override public void windowOpened(WindowEvent e) {}

  public static void main(String[] args) {
    new Main("Command Pattern Sample");
  }
}
