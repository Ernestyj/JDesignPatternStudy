package eugene.behavioral.observer.generic;

import eugene.behavioral.observer.WeatherType;

/**
 * Created by Jian on 2015/7/29.
 */
public class GWeather extends Observable<GWeather, Race, WeatherType> {
    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather + ".");
        notifyObservers(currentWeather);
    }
}
