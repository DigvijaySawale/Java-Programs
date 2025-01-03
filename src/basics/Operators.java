package basics;

public class Operators {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;

        //arithmetic operator
//        int result = a + b;
//        System.out.println(result);
        int c = a/b;
        double d = a/b;
        double e = (double)a/b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int f = a%b;
        System.out.println(f);

        //assignment operator

        a+=b;
        System.out.println(a);

        //relational operator

        int m = 12;
        int n = 7;
/*
        System.out.println(m==n);
        System.out.println(m!=n);
        System.out.println(m<n);
        System.out.println(m>n);
        System.out.println(m<=n);
        System.out.println(m>=n);*/


        // logical operator
        boolean firsEx = true;
        boolean secondEx = false;
/*
        System.out.println(firsEx && secondEx);
        System.out.println(firsEx || secondEx);
        System.out.println(!firsEx);
        System.out.println(!secondEx);
        System.out.println(!(firsEx && secondEx));*/


        // Unary/ other operator
        int x = 12;
        x++; // increment operator
        System.out.println(x);
        x--; // decrment operator
        System.out.println(x);

    }
}
