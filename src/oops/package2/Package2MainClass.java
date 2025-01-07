package oops.package2;

import oops.packages.Teacher;  // import class Teacher from package package

public class Package2MainClass {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
//        obj.id = 14;  // cant do as private property
        obj.teachingClass = 4;

//        obj.degree = "BE"; // cant access here as degree is default;
    }
}


class NewClass extends Teacher {
    public static void main(String[] args) {
        NewClass newobj = new NewClass();

        newobj.teachingClass = 4;
//        newobj.id = 23;
//        newobj.degree = "BE";
        newobj.studentCount = 234;  // since studentCount is protected it can be used here
    }
}
