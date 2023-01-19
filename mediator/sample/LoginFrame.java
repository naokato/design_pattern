import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
  private ColleagueCheckbox checkGuest;
  private ColleagueCheckbox checkLogin;
  private ColleagueTextField textUser;
  private ColleagueTextField textPass;
  private ColleagueButton buttonOk;
  private ColleagueButton buttonCancel;

  public LoginFrame(String title) {
    super(title);

    setBackground(Color.lightGray);

    setLayout(new GridLayout(4, 2));

    createColleagues();

    add(checkGuest);
    add(checkLogin);
    add(new Label("Username:"));
    add(textUser);
    add(new Label("Password:"));
    add(textPass);
    add(buttonOk);
    add(buttonCancel);

    // initialized enabled/disabled
    colleagueChanged();

    pack();
    setVisible(true);
  }

  @Override
  public void createColleagues() {
    // Check Box
    CheckboxGroup g = new CheckboxGroup();
    checkGuest = new ColleagueCheckbox("Guest", g, true);
    checkLogin = new ColleagueCheckbox("Login", g, false);

    // Text Field
    textUser = new ColleagueTextField("", 10);
    textPass = new ColleagueTextField("", 10);
    textPass.setEchoChar('*');

    // Button
    buttonOk = new ColleagueButton("OK");
    buttonCancel = new ColleagueButton("Cancel");

    // set Mediator
    checkGuest.setMediator(this);
    checkLogin.setMediator(this);
    textUser.setMediator(this);
    textPass.setMediator(this);
    buttonOk.setMediator(this);
    buttonCancel.setMediator(this);

    // set Listener
    checkGuest.addItemListener(checkGuest);
    checkLogin.addItemListener(checkLogin);
    textUser.addTextListener(textUser);
    textPass.addTextListener(textPass);
    buttonOk.addActionListener(this);
    buttonCancel.addActionListener(this);
  }

  @Override
  public void colleagueChanged() {
    if (checkGuest.getState()) {
      textUser.setColleagueEnabled(false);
      textPass.setColleagueEnabled(false);
      buttonOk.setColleagueEnabled(true);
    } else {
      textUser.setColleagueEnabled(true);
      userPassChanged();
    }
  }

  private void userPassChanged() {
    if (textUser.getText().length() > 0) {
      textPass.setColleagueEnabled(true);
      if (textPass.getText().length() > 0) {
        buttonOk.setColleagueEnabled(true);
      } else {
        buttonOk.setColleagueEnabled(false);
      }
    } else {
      textPass.setColleagueEnabled(false);
      buttonOk.setColleagueEnabled(false);
    }
  } 

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.toString());
    System.exit(0);
  }
}
