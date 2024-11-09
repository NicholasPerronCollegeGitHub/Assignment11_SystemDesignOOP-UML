package Pak3;

public class Octagon extends AbstractShape {
    private int sideLength;

    Octagon(int s){
        name = "Octagon";
        sideLength = s;
        sides = 8;
    }

    Octagon(){
        name = "Octagon";
        sideLength = 1;
        sides = 8;
    }

    public int getSides() {
        return(sides);
    }

    public void shapeInformation() {
        System.out.println("Shape: " + name);
        System.out.println("Sides: " + sides);
        System.out.println("Side Length: " + sideLength);
        this.area();
        this.totalAngle();
    }

    private void area(){
        double step1 = 1 + Math.sqrt(2);
        double total = (2 * step1) * Math.pow(sideLength, 2);
        System.out.println("This octagon has an area of: " + total);
    }
    
}
