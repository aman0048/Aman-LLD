package designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver.services;

import designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver.Observer;
import designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver.utils.SendNotification;

public class PressureService implements Observer {

    @Override
    public void weatherConditionNotifier(double value){
        SendNotification.sendNotification("Calling from Pressure service with value " + value);
    }
}
