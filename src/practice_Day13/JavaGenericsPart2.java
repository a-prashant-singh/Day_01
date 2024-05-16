package practice_Day13;

public class JavaGenericsPart2 <E> {

    E[] a;
     public JavaGenericsPart2(E[] a) {
       this.a=a;
   }
    public static void main(String[] args) {
        //Create toprint method for pring all the array
        Integer[] a={1,3,4,3,3,4,2,9};
        Double[] b={3.3,6.7, 3.0, 2.0,9.9};
        Character[] c={'s','d','f','q'};

        new JavaGenericsPart2<>(a).toprint(a);
        new JavaGenericsPart2<>(b).toprint(b);
        new JavaGenericsPart2<>(c).toprint(c);
    }
    public  void toprint(E[] a) {
        for(E i:a)
            System.out.println(i);
    }
}
