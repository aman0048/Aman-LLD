package designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver.services;

import designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver.Observer;
import designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver.utils.SendNotification;

public class HumidityService implements Observer {

    @Override
    public void weatherConditionNotifier(double value){
        SendNotification.sendNotification("Calling from Humidity service with value " + value);
    }
}
