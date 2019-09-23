package learning.java8.stream;

import java.util.ArrayList;
import java.util.Collection;

public class Stream {
    public static void main(String[] args) {
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("RED"));
        shapes.add(new Shape("GREEN"));
        shapes.add(new Shape("BLUE"));
        shapes.add(new Shape("YELLOW"));
        shapes.add(new Shape("MAGENTA"));

        //case 1
        for (Shape s : shapes){
            s.setColor("RED");
        }

        //case 2
        shapes.forEach(s -> s.setColor("BLUE"));

        //case 3
        shapes.stream().filter(s-> s.getColor().equalsIgnoreCase("BLUE")).forEach(s->s.setColor("RED"));

        //case 4
//        System.out.println(shapes.stream()
//                .filter(s->s.getColor().equalsIgnoreCase("YELLOW")).map(s->s.getContainingBox()).into( new ArrayList<>()));
    }


}

class Shape{



    public Shape(String color) {
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box getContainingBox() {
        return new Box(color.length());
    }
}
class Box{
    private int boxSize;

    public Box(int boxSize) {
        this.boxSize = boxSize;
    }
}