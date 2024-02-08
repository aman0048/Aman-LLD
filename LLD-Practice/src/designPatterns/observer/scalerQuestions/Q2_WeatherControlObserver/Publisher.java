package designPatterns.observer.scalerQuestions.Q2_WeatherControlObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(double value){
        observerList.forEach(observer -> observer.weatherConditionNotifier(value));
    }
}
