package learning.java8.nileshsirwebinar;

interface Shape {
    double calcArea();

    double calcPeri();

    //java 8 way
    default String name() {
        return "Unknown";
    }
}

//before java 8
interface Shape2 extends Shape {
    String name();
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPeri() {
        return 4 * side;
    }
}

class Circle implements Shape2 {
    private int side;

    public Circle(int side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPeri() {
        return 4 * side;
    }

    @Override
    public String name() {
        return null;
    }
}


public class Demo01Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square);
    }
}
