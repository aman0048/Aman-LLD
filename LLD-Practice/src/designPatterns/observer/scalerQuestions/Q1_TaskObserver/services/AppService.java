package designPatterns.observer.scalerQuestions.Q1_TaskObserver.services;

import designPatterns.observer.scalerQuestions.Q1_TaskObserver.Observer;
import designPatterns.observer.scalerQuestions.Q1_TaskObserver.utils.NotificationUtils;

public class AppService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, userId));
    }
}
