package practice_Day13;

public class JavaGenerics <x,y,z> {
    x[] a;
    y[] b;
    z[] c;

    public JavaGenerics(x[] a,y[] b,z[] c) {
        this.a=a;
        this.b =b;
        this.c=c;
    }
    public static void main(String[] args) {
        //Create toprint method for pring all the array
         Integer[] a={1,3,4,3,3,4,2,9};
        Double[] b={3.3,6.7, 3.0, 2.0,9.9};
        Character[] c={'s','d','f','q'};

      JavaGenerics<Integer,Double,Character> d= new JavaGenerics<>(a,b,c);
        d.toPrint();
//or
       // new JavaGenerics<Integer,Double,Character>(a,b,c).toPrint();
        // new JavaGenerics<Double,Integer,Character>(b,a,c).toPrint();
    }

    private void toPrint() {
        toPrintArray(a);
        toPrintArray(b);
        toPrintArray(c);
    }

    private <W> void toPrintArray(W[] a) {
        for(W i:a)
            System.out.println(i);
    }


}
