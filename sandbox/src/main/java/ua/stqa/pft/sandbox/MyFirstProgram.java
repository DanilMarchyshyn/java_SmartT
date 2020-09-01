package ua.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Sveta");

        Square s = new Square(7);
        System.out.println("Площадь квадрата со сторной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(8, 7);
        System.out.println("Площадь прямоугольника со сторнами " + r.a + " и " + r.b +" = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }




}