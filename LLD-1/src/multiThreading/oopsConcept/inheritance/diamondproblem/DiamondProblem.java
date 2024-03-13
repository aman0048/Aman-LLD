package multiThreading.oopsConcept.inheritance.diamondproblem;
interface Parent {
    public void fun();
}
class Parent1 implements Parent{
    @Override
    public void fun(){
        System.out.println("Parent1");
    }
}

class Parent2 implements Parent{
    public void fun(){
        System.out.println("Parent2");
    }
}
//public class Child extends Parent1, Parent2 {
//    // this will cause a diamond problem
//}
