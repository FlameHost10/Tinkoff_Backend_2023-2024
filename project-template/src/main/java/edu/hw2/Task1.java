package edu.hw2;


public class Task1 {

    public sealed interface Expr {
        double evaluate();
        public record Constant(double numb) implements Expr {
            @Override
            public double evaluate() {
                return numb;
            }

            @Override
            public String toString() {
                return String.valueOf(numb);
            }
        }
        public record Negate(Expr expr) implements Expr {
            @Override
            public double evaluate() {
                return -expr.evaluate();
            }

            @Override
            public String toString() {
                return String.valueOf(-expr.evaluate());
            }
        }
        public record Exponent(Expr expr, double exponent) implements Expr {
            @Override
            public double evaluate() {
                return Math.pow(expr.evaluate(), exponent);
            }

            @Override public String toString() {
                return expr.evaluate() + "^" + exponent;
            }
        }
        public record Addition(Expr exprFirst, Expr exprSecond) implements Expr {
            @Override
            public double evaluate() {
                return exprFirst.evaluate() + exprSecond.evaluate();
            }

            @Override public String toString() {
                return exprFirst.evaluate() + " + " + exprSecond.evaluate();
            }
        }
        public record Multiplication(Expr exprFirst, Expr exprSecond) implements Expr {
            @Override
            public double evaluate() {
                return exprFirst.evaluate() * exprSecond.evaluate();
            }
            @Override public String toString() {
                return exprFirst.evaluate() + " * " + exprSecond.evaluate();
            }
        }
    }


}
