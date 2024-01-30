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

        // Student Registry Code
        Student studentPrototypeBatchA = new Student("2023", "BatchA", "HLD", "Sandeep", "12-June-23", "MWF", "30-Apr-2024");
        Student studentPrototypeBatchB = new Student("2023", "BatchB", "LLD", "naman", "12-Dec-23", "TTS", "30-June-2024");
        Student studentPrototypeBatchC = new Student("2024", "BatchC", "DSA", "mohit", "12-Jan-24", "MWF Morning", "30-Dec-2024");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);

        Student addNewStudentInBatchA = studentRegistry.get(studentPrototypeBatchA.getBatchName()).clone();
        addNewStudentInBatchA.setName("Ashu");
        addNewStudentInBatchA.setEmail("ashu@gmail");
        addNewStudentInBatchA.setPhoneNumber("8997656");

        System.out.println(addNewStudentInBatchA);
    }

}
