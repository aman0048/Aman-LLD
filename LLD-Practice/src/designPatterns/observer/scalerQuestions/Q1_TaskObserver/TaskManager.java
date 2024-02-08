package designPatterns.observer.scalerQuestions.Q1_TaskObserver;

public class TaskManager extends Publisher{
    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId);
    }
}
