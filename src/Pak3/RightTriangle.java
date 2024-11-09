package Pak3;

public class RightTriangle extends AbstractShape{

    private double sideA;
    private double sideB;
    
    public RightTriangle(){
        sideA = 3.0;
        sideB = 4.0;
        sides = 3;
        name = "Right Triangle";
    }
    public RightTriangle(double a, double b){
        sideA = a;
        sideB = b;
        sides = 3;
        name = "Right Triangle";
    }
    public int getSides() {
        return(sides);
    }

    
    public void shapeInformation() {
        System.out.println("Name: " + name);
        System.out.println("Sides: " + sides);
        System.out.println("Side 1 length: " + sideA);
        System.out.println("Side 2 length: " + sideB);
        this.Hypoteneuse();
        this.totalAngle();
    }
    
    private void Hypoteneuse(){
        double tempA = Math.pow(sideA, 2);
        double tempB = Math.pow(sideB, 2);
        double added = tempA + tempB;
        System.out.println("Hypoteneuse length: " + Math.sqrt(added));
    }
}
