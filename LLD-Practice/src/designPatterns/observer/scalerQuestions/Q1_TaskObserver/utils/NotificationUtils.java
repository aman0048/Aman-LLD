package designPatterns.observer.scalerQuestions.Q1_TaskObserver.utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String content) {
        System.out.println(subject + ", " + content);
    }

    public static void sendSlack(String subject, String content) {
        System.out.println(subject + ", " + content);
    }

    public static void sendPush(String subject, String content) {
        System.out.println(subject + ", " + content);
    }
}