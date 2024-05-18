package State;

public interface State {
    public abstract void doClock(Context context, int hour);

    public abstract void doUse(Context context);

    public abstract void doAlarm(Context Context);

    public abstract void doPhone(Context context);    
} 
