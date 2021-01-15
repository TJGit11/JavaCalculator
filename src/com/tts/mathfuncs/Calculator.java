package com.tts.mathfuncs;

public class Calculator {

    public static class Add {
        static public double addNum(double int1, double int2) {
            return int1 + int2;
        }
    }

    public static class Subtract {
        public static double subNum(double int1, double int2) {
            return int1 - int2;
        }
    }

    public static class Multiply {
        public Multiply() {
        }
        public static double multNum(double int1, double int2) {
            return int1 * int2;
        }
    }

    public static class Divide {
        public static double divNum(double int1, double int2) {
            return int1 / int2;
        }
    }


    public static class Square {
        public static double sqNum(double int1) {
            return int1 * int1;
        }
    }

    public static class SquareRoot {
        public static double sqrtNum(double int1) {
            return Math.sqrt(int1);
        }
    }

    public static class Sine {
        public static double sinNum(double int1) {
            return Math.sin(int1);
        }
    }

        public static class Cosine {
            public static double cosNum(double int1) {
                return Math.cos(int1);
            }
        }

    public static class Tangent {
        public static double tanNum(double int1) {
            return Math.tan(int1);
        }
    }

    public static class Factorial {
        public static long factNum(double int1) {
            int i, fact = 1;
            for (i = 1; i <= int1; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static class Pi {
        public static double piNum(double int1) {
            return int1 * 3.14159265358979323846;
        }
    }

    public static class Power {
        public static double powNum(double int1, double int2) {
            return Math.pow(int1, int2 );
        }
    }

    public static class Absolute{
        public static double absNum(double int1){
            return Math.abs(int1);
        }
    }

    public static class Log{
        public static double logNum (double int1) {
            return Math.log(int1);
        }
    }
    public static class Log10{
        public static double log10Num(double int1){
            return Math.log10(int1);
        }
    }
    }


