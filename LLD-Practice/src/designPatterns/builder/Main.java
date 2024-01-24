package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Student s = new Student.Builder()
                .setId(12)
                .setAge(24)
                .setName("Aman")
                .setGradYear(2022)
                .setPsp(20)
                .setUniversityName("IP")
                .setPhoneNumber("9811")
                .build();

        System.out.println(s);
    }
}
