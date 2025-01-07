package oops.packages;

public class Teacher {

    public int teachingClass;  //making property as public
    private int id;  // id is private
    String degree; // degree is default

    protected int studentCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 3;
        obj.id = 3; // here private property can be accessed


    }

}
