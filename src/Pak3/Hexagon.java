package Pak3;

public class Hexagon extends AbstractShape {
    private int sideLength;
    public Hexagon(int l){
        name = "Hexagon";
        sides = 6;
        sideLength = l;
    }

    public Hexagon(){
        name = "Hexagon";
        sides = 6;
        sideLength = 2;
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
    private void area() {
        double tempA = Math.sqrt(3);
        double b = tempA * sideLength;
        double c = b / 2;
        System.out.println("This hexagon has an area of: " + (3 * c));    
    }
    
}
