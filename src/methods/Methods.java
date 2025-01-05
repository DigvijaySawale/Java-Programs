package methods;

public class Methods {
    public static void main(String[] args) {
        greet();
//        average(4,6);
        int avg = average(4,6);
        System.out.println(avg);
    }

    static void greet() {
        System.out.println("Hello World!");
    }

//    public static void average(int a, int b) {
//        int result = (a+b)/2;
//        System.out.println(result);
//    }

    public  static int average(int a, int b) {
        return (a+b)/2;
    }
}
