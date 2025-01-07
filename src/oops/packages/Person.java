package oops.packages;

public class Person {
    private int age;
    private String name;
    boolean canUpdate = true;

    public static int count = 45;  // static variable
    static {
        // this is a static block
        // it is executed as soon as class is loaded, even before main method
        System.out.println("Called from static block");
    }

    // setter method
    public void setAge(int age) {
        System.out.println("Called from main method");
        // used to have some control over updating the values
        // eg. below flag
        if(canUpdate) {
            if(age > 0) {
                this.age = age;
            }
        }
    }

    // getter method
    public int getAge() {
        return age;
    }
}
