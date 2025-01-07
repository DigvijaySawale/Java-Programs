package oops.encapsulation;

import oops.packages.Person;

public class MainInEncapsulationClass {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(23);
        System.out.println(p1.getAge());

        System.out.println(p1.count);  // accessing static variable using instance/object p1
        System.out.println(Person.count); // accessing static variable without using any instance


        p1.count = 99; // this updates the value for class but not only for this object

        Person p2 = new Person();
        System.out.println(p2.count);
        System.out.println(Person.count);
    }
}
