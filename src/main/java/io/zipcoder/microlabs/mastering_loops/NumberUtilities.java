package io.zipcoder.microlabs.mastering_loops;

public class NumberUtilities {
private static int stop;
    public static String getEvenNumbers(int start, int stop) {

        String solution = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0)
                solution += i;

        }
        return solution;
    }



    public static String getOddNumbers(int start, int stop) {
        String solution = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0)
                solution += i;

        }
        return solution;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String solution = "";
        for (int i = start; i < stop; i=step+i) {
            String p="";

            p = String.valueOf(i*i);
            solution= solution+p;

        }
            return solution;
        }


        public static String getRange (int stop) {
        String solution = "";
            for(int i = 0; i<stop; i++) {
                String r = "";
                r = String.valueOf(i);
                solution= solution+r;
        }

    return solution;
        }

        public static String getRange ( int start, int stop) {
            String solution = "";
            for(int i = start; i<stop-1; i++) {
                String rng = "";
                rng = String.valueOf(i);
                solution= solution+rng;
            }
            return solution;
        }

        public static String getRange ( int start, int stop, int step){

            String solution = "";
            for (int i = start; i < stop-1; i=step+i) {
                String rnge = "";
                rnge = String.valueOf(i);
                solution= solution+rnge;
            }
            return solution;
        }
        public static String getExponentiations ( int start, int stop, int step, int exponent){
            String solution = "";
            for (int i = start; i < stop; i=step+i) {
                String e;
            int v =0;
                v = (int)Math.pow(i, exponent);
                e=String.valueOf(v);

                solution = solution + e;
            }
            return solution;
        }
    }