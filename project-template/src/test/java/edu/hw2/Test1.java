package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    @DisplayName("Арифметические действия ")
    void arithmeticOperations(){
        var two = new Task1.Expr.Constant(2);
        var four = new Task1.Expr.Constant(4);
        var negOne = new Task1.Expr.Negate(new Task1.Expr.Constant(1));
        var sumTwoFour = new Task1.Expr.Addition(two, four);
        var mult = new Task1.Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Task1.Expr.Exponent(mult, 2);
        var res = new Task1.Expr.Addition(exp, new Task1.Expr.Constant(1));

        System.out.println(two + " = " + two.evaluate());
        System.out.println(negOne + " = " + negOne.evaluate());
        System.out.println(sumTwoFour + " = " + sumTwoFour.evaluate());
        System.out.println(mult + " = " + mult.evaluate());
        System.out.println(exp + " = " + exp.evaluate());
        System.out.println(res + " = " + res.evaluate());


    }
}
