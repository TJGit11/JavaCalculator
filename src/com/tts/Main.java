package com.tts;
import com.tts.mathfuncs.Calculator;

public class Main {

    public static void main(String[] args) {

            System.out.println(Calculator.Add.addNum(22.50, 33.25));
            System.out.println(Calculator.Subtract.subNum(129.5, 50.75));
            System.out.println(Calculator.Multiply.multNum(5.0, 5.0));
            System.out.println(Calculator.Divide.divNum(9.0, 3.0));
            System.out.println(Calculator.Square.sqNum(6));
            System.out.println(Calculator.SquareRoot.sqrtNum(49));
            System.out.println(Calculator.Sine.sinNum(3));
            System.out.println(Calculator.Cosine.cosNum(3));
            System.out.println(Calculator.Tangent.tanNum(23));
            System.out.println(Calculator.Factorial.factNum(5));

    }

}
