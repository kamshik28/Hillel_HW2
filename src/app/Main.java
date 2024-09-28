package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter App - Version 1.0");
        double miles = 10;
        double kilometers = milesToKilos(miles);
        System.out.println(miles + " miles is " + kilometers + " kilometers.");

    }
    public static double milesToKilos(double miles) {
        return miles * 1.60934;
    }

}