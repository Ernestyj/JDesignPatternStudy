package eugene.structural.eventaggregator;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Scout produces events.
 *
 */
public class Scout extends EventEmitter {
    public Scout() {
        super();
    }

    public Scout(EventObserver obs) {
        super(obs);
    }

    @Override
    public void timePasses(Weekday day) {
        if (day.equals(Weekday.TUESDAY)) {
            notifyObservers(Event.WARSHIPS_APPROACHING);
        }
    }
}
