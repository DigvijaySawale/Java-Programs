package oops.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        int a = 5;
//        changeValue(a);
//        System.out.println(a);  // here value of a is not changes as it is stored in stack memory

//        Data obj = new Data();
//        obj.data = 10;
//        changeValue(a,obj);
//        System.out.println(a);
//        System.out.println(obj.data);  // value of obj is changed as obj is stored in heap memory

        Data d;
        d = new ChildData();
        d.printData();

        Data d2 = new Data();
        d2.printData(3);
    }

//    static void changeValue(int a) {
//        a = 10;
//    }

    static void changeValue(int a, Data obj) {
        a = 10;
        obj.data = 100;
    }
}

class Data {
    int data;

    public void printData() {  // run time polymorphism aka method overriding
        System.out.println(data);
    }

    public void printData(int times) {  // compile time polymorphism aka method overloading
        System.out.println(times + " times " + data + " = " + times*data);
    }
}

class ChildData extends Data {
    @Override
    public void printData() {  // run time polymorphism
        System.out.println("Overridden " + data);
    }
}