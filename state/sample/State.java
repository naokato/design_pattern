// State
// Classes implement this interface are kind of "state"
public interface State {
  // methods which behaviors are depended on the "state"
  public abstract void doClock(Context context, int hour);
  public abstract void doUse(Context context);
  public abstract void doAlarm(Context context);
  public abstract void doPhone(Context context);
}
