package Pak3;

public class Circle extends AbstractShape {
    private double radius;

    Circle(double r){
        radius = r;
        name = "Circle";
        sides = 0;
    }
    public void totalAngle() {
        System.out.println("A circle has a radius of 360 degrees (2π radians)");
    }
    
    Circle(){
        radius = 1;
        name = "Circle";
        sides = 0;
    }

    public int getSides() {
        System.out.println("A circle does not technically have sides.");
        return(sides);
    }

    public void shapeInformation() {
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + this.Circumference());
        System.out.println("Area: " + this.area());
    }

    private double Circumference(){
        double stepA = radius * Math.PI;
        return(stepA * 2);
    }

    private double area(){
        double temp = Math.pow(radius, 2);
        return(Math.PI * temp);
    }
    
}
