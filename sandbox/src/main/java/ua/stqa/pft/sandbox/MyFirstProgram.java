package ua.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Sveta");

        double t = 5;
        System.out.println("Площадь квадрата со сторной " + t + " = " + area(t));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double e) {
        return e * e;
    }

    public static double area ()

}