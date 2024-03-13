package multiThreading.oopsConcept.inheritance.diamondproblem;

interface Parent1Class extends Parent{
}

interface Parent2Class extends Parent{
}

public class Solution1 implements Parent1Class, Parent2Class {
    @Override
    public void fun() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Solution1 child2 = new Solution1();
        child2.fun();
    }


}
