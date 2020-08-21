package ua.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Sveta");

        Square s = new Square(7);
        System.out.println("Площадь квадрата со сторной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(8, 7);
        System.out.println("Площадь прямоугольника со сторнами " + r.a + " и " + r.b +" = " + area(r));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (Square s) {
        return s.l  * s.l;
    }

    public static double area (Rectangle r) {
        return r.a * r.b;
    }


}