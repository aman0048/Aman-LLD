package multiThreading.oopsConcept.inheritance.diamondproblem;

interface ParentClass1{
    public default void fun(){
        System.out.println("Parent1");
    }
}

interface ParentClass2 {
    public default void fun(){
        System.out.println("Parent2");
    }
}

public class Solution2 implements ParentClass1, ParentClass2 {
    @Override
    public void fun() {
        ParentClass1.super.fun();
        ParentClass2.super.fun();
    }
    public static void main(String[] args) {
        Solution2 child2 = new Solution2();
        child2.fun();
    }


}
