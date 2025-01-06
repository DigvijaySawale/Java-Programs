package oops;

public class Constructors {
    public static void main(String[] args) {
        Complex num1 = new Complex(); // default constructor is called,, assigns default(0) values to class properties
        num1.printComplexNumber();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Complex num2 = new Complex(4,5);
        num2.printComplexNumber();

        Complex num3 = new Complex(2,3);
        num3.printComplexNumber();

        System.out.println("Adding two complex numbers");
        Complex num4 = num2.add(num3);
        num4.printComplexNumber();
    }
}

class Complex {
    int a, b;

    //default constructor but explicitly defined
    public Complex() {
        a = 2;
        b = 3;
    }


//    public Complex(int real, int imaginary) {
//        a = real;
//        b= imaginary;
//    }  // commented to understand this keyword

    public Complex(int a, int b) {
//        a = a;
//        b = b;  // this type of code creates ambiguity and confuses compiler as here its same variable name

        //to avoid above we use 'this' keyword
        this.a = a;
        this.b = b;
    }


    void printComplexNumber() {
        System.out.println(a +" + "+ b + "i");
    }

    Complex add(Complex num2) {
//        printComplexNumber();  // creates ambiguity as we don't know for which object we are calling this method
        this.printComplexNumber(); // this tells us that we are calling method on current object
        System.out.println(this);  // 'this' stores reference of current object
        return new Complex(a+num2.a, b+num2.b);
    }
}
