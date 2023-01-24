public class EmergencyState implements State {
  private static EmergencyState singleton = new EmergencyState();

  private EmergencyState() {
  }

  public static State getInstance() {
    return singleton;
  }

  @Override
  public void doClock(Context context, int hour) {
  }

  @Override
  public void doUse(Context context) {
    context.callSecurityCenter("[非常事]金庫が利用されました");
  }

  @Override
  public void doAlarm(Context context) {
    context.callSecurityCenter("[非常事]非常ベルが鳴りました");
  }

  @Override
  public void doPhone(Context context) {
    context.callSecurityCenter("[非常事]非常時の電話");
  }

  @Override
  public String toString() {
    return "[緊急時]";
  }
}
