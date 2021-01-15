package com.tts.mathfuncs;

public class Calculator {

    //    public static class SquareNum {
//        public void main(String [] args)
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter a number: ");
//            int num = sc.nextInt();
//            System.out.println("Your squared number is: " + square(num));
//        }
//        public int square(int num)
//        {
//            return num * num;
//        }
//    }
    public static class Add {
        public double int1;
        public double int2;


        public Add() {
        }

        ;

        public Add(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        static public double addNum(double int1, double int2) {
            return int1 + int2;
        }


    }

    public static class Subtract {
        public double int1;
        public double int2;

        public Subtract() {
        }

        ;

        public Subtract(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        public static double subNum(double int1, double int2) {
            return int1 - int2;
        }


    }

    public static class Multiply {
        public double int1;
        public double int2;

        public Multiply() {
        }

        ;

        public Multiply(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        public static double multNum(double int1, double int2) {
            return int1 * int2;
        }


    }

    public static class Divide {
        public double int1;
        public double int2;

        public Divide() {
        }

        public Divide(double int1, double int2) {
            this.int1 = int1;
            this.int2 = int2;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public double getInt2() {
            return int2;
        }

        public void setInt2(double int2) {
            this.int2 = int2;
        }

        public static double divNum(double int1, double int2) {
            return int1 / int2;
        }
    }


    public static class Square {
        public double int1;


        public Square() {
        }

        public Square(double int1) {
            this.int1 = int1;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public static double sqNum(double int1) {
            return int1 * int1;
        }
    }

    public static class Sine {
        public double int1;


        public Sine() {
        }

        public Sine(double int1) {
            this.int1 = int1;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public static double sinNum(double int1) {
            return Math.sin(int1);
        }
    }

        public static class Cosine {
            public double int1;


            public Cosine() {
            }

            public Cosine(double int1) {
                this.int1 = int1;
            }

            public double getInt1() {
                return int1;
            }

            public void setInt1(double int1) {
                this.int1 = int1;
            }

            public static double cosNum(double int1) {
                return Math.cos(int1);
            }
        }

    public static class Tangent {
        public double int1;


        public Tangent() {
        }

        public Tangent(double int1) {
            this.int1 = int1;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public static double tanNum(double int1) {
            return Math.tan(int1);
        }
    }

    public static class Factorial {
        public double int1;


        public Factorial() {
        }

        public Factorial(double int1) {
            this.int1 = int1;
        }

        public double getInt1() {
            return int1;
        }

        public void setInt1(double int1) {
            this.int1 = int1;
        }

        public static long factNum(double int1) {
            int i, fact = 1;
            for (i = 1; i <= int1; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
    }


