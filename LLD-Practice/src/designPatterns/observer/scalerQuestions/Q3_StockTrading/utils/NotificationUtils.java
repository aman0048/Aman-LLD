package designPatterns.observer.scalerQuestions.Q3_StockTrading.utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String content) {
        System.out.println(subject + " " + content);
    }

    public static void sendSms(String subject, String content) {
        System.out.println(subject + " " + content);
    }

    public static void sendPush(String subject, String content) {
        System.out.println(subject + " " + content);
    }
}