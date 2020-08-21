package ua.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Sveta");

        double t = 5;
        System.out.println("Площадь квадрата со сторной " + t + " = " + area(t));

        double a = 6;
        double b = 7;
        System.out.println("Площадь прямоугольника со сторнами " + a + " и " + b +" = " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double e) {
        return e * e;
    }

    public static double area (double a, double b) {
        return a * b;
    }


}