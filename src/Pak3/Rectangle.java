package Pak3;

public class Rectangle extends AbstractShape{
    private int length;
    private int width;

    public Rectangle(int l, int w){
        name = "Rectangle";
        sides = 4;
        length = l;
        width = w;
    }

    public Rectangle(){
        name = "Rectangle";
        sides = 4;
        length = 5;
        width = 10;
    }

    public int getSides() {
        return(this.sides);
    }
    public void shapeInformation() {
        System.out.println("Shape: " + name);
        System.out.println("Sides: " + sides);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        this.area();
        this.totalAngle();
    }
    public void area(){
        System.out.println("This rectangle's area is: " + (length * width));
    }
}
