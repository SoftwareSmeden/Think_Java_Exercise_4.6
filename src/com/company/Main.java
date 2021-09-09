package com.company;

public class Main {

    public static void main(String[] args) {
        //Think Java - Exercise 4.6.

        //Punkt 3:
        double sum = multAdd(1.0, 2.0, 3.0);
        System.out.printf("Testing: 1.0 * 2.0 + 3.0 = %.1f \n", sum);

        //Punkt 4:
        double sumTwo = multAdd(1.0, Math.sin(Math.PI/4), Math.cos(Math.PI/4)/2 );
        System.out.printf("1.0 * Math.sin(Math.PI/4) + Math.cos(Math.PI/4)/2 = %.2f \n", sumTwo);
        double sumThree = multAdd(1.0, Math.log(10.0), Math.log(20.0));
        System.out.printf("1.0 * Math.log(10) + Math.log(20) = %.2f \n", sumThree);

        //Punkt 5:
        double x = 2.0;
        double sumFour = expSum(x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x)));
        System.out.printf("2.0 * Math.exp(-2) + Math.sqrt(1 - Math.exp(-2)) = %.2f \n", sumFour);
    }

        //Punkt 2:
    public static double multAdd(double a, double b, double c){
        return (a * b + c);
    }

        //Punkt 5. forsat:
    public static double expSum(double d){
        return(d);
    }
}