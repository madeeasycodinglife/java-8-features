package org.madeeasy.lambdaexpression;

import org.madeeasy.functionalinterface.AdditionFunctionalInterface;
import org.madeeasy.functionalinterface.MultiplicationFunctionalInterface;
import org.madeeasy.functionalinterface.SubtractionFunctionalInterface;

public class Lambda {

    /**
     * method to implement AdditionFunctionalInterface with lambda expression
     */

    public AdditionFunctionalInterface addition() {
        return (a,b) -> a + b;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        //--------------------------------Start Addition------------------------
        AdditionFunctionalInterface addition = lambda.addition();
        System.out.println(addition.add(1, 2));
        //--------------------------------End Addition------------------------
        //--------------------------------Start Subtraction------------------------
        SubtractionFunctionalInterface subtraction = (a, b) ->  a - b;
        System.out.println(subtraction.sub(1, 2));
        //--------------------------------End Subtraction------------------------
        //--------------------------------Start Multiplication------------------------
        System.out.println(multiplication((a,b)->a+b));
        //--------------------------------End Multiplication------------------------

    }

    private static int multiplication(MultiplicationFunctionalInterface multiplicationFunctionalInterface) {
      return   multiplicationFunctionalInterface.multiplication(1, 2);
    }

}
