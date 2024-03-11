package multiThreading.javaPackage;

import java.util.Comparator;
import java.util.Objects;

public class CustomClass {
    private int age;
    private String name;

    public CustomClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
          if (obj == this) return true;
//          if(obj == null || getClass() != obj.getClass()) return false;
          if(!(obj instanceof CustomClass)) return false;

          CustomClass c = (CustomClass) obj;
          return age == c.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

//    @Override
//    public int hashCode()
//    {
//
        // We are returning the age
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
//        return this.age;
//    }
}
