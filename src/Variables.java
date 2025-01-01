public class Variables {
    public static void main(String[] args) {
        boolean isPassed = true;
        int count = 12;
        byte marks = 13;

//        float pi = 3.14;  // will convert to double
        float pi2 = 3.14f; // to use as float only use 'f' at end

        double pi3 = 3.14;

        System.out.println(isPassed);
        System.out.println(count);
        System.out.println(marks);

//        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(pi3);

        char a = 'a';
//        char b = "b";

        System.out.println(a);
//        System.out.println(b);

        // data type implicit conversion
        int i = 12;
        int l = i;

        // explicit conversion
        long ll = 12;
//        int ii = ll;  // cant do properly
        int ii = (int)ll;
    }
}
