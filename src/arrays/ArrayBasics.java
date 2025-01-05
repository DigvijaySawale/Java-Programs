package arrays;

public class ArrayBasics {
    public static void main(String[] args) {
//        int age[];   // array declaration
//        int[] age2;
//
//        age = new int[5];  // memory allocation;

        int[] age = new int[5];  //same line declaration and allocation

        age[0] = 23;
        age[1] = 25;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);  //since no value is here java puts 0 by default

        System.out.println("Size Of Array : " + age.length);

        // ARRAY INITIALIZATION
        int[] notes = {10, 20, 50, 100, 500};

        System.out.println(notes[4]);


        // ITERATION THROUGH ARRAY
        // FOR EACH LOOP
        String[] names = {"Ram", "Sham", "Kumar", "Rox"};

        //normal loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //for each loop
        for(String name : names) {
            System.out.println(name);
        }

    }
}
