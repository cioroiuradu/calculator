package org.fasttrackit;

public class Exercise {
    public double X;
    public double Y;
    public double result;

    public double sum(double X, double Y) {
        double result = X + Y;
        System.out.println(" Suma celor 2 numere este " + result);
        return result;
    }

    public double divide(double X, double Y){
        double result = X / Y;
        System.out.println(" Rezultatul impartirii celor 2 numere este " + result);
        return result;
    }

    public double multiply(double X, double Y){
        double result = X * Y;
        System.out.println(" Rezultatul inmultirii celor 2 numere este " + result);
        return result;
    }
}
