package multiThreading.javaPackage;

public class StringPractise {
    public static void main(String[] args) {
        String a = "aman";
        String b = "aman";
        a = a+b;
        b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        CustomClass c = new CustomClass(22, "aman");
        CustomClass c1 = new CustomClass(22, "aman");
        System.out.println("Test");
//        System.out.println(c == c1);
        if (c.equals(c1)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}
