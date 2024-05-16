package practice_Day13;

public class JavaGenericsPart1 {
    public static void main(String[] args) {


        //Create toprint method for pring all the array
        int[] a={1,3,4,3,3,4,2,9};
        double[] b={3.3,6.7, 3.0, 2.0,9.9};
        char[] c={'s','d','f','q'};
        toprint(a);
        toprint(b);
        toprint(c);

    }
    private static void toprint(int[] a) {
        for(int i:a)
            System.out.println(i);
    }
    private static void toprint(double[] b) {
        for(double i:b)
            System.out.println(i);
    }
    private static void toprint(char[] c) {
        for(char i:c)
            System.out.println(i);
    }
}
