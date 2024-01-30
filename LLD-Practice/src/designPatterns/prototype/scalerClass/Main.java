package designPatterns.prototype.scalerClass;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student studentPrototype = new Student("2023", "BatchA", "LLD", "Sandeep", "12-Dec-23", "TTS", "30-Apr-2024");
        System.out.println(studentPrototype);

        Student studentCopy = studentPrototype.clone();
        studentCopy.setName("Aman");
        studentCopy.setEmail("aman@gmail.com");
        studentCopy.setPhoneNumber("767811111");

        System.out.println(studentCopy);
    }

}
