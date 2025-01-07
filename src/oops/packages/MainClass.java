package oops.packages;

import java.util.ArrayList;  // importing class from a package
import java.util.List;
import java.util.Scanner;  // importing Scanner class from java.util package
//import java.util.*;  // importing complete package

public class MainClass {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();

        Teacher obj = new Teacher();
        obj.teachingClass = 3;
//        obj.id = 3;  // cant do as teacher's id is private
        obj.degree = "BSC";  // can be accessed here as degree is default

    }
}
