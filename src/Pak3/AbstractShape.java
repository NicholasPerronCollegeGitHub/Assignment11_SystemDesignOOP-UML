package Pak3;

public abstract class AbstractShape {
    protected int sides;
    protected String name;
    public AbstractShape(){
        sides = 4;
        name = "Square";
    }
    public AbstractShape(int x, String SetName){
        name = SetName;
        sides = x;
    }

    public abstract int getSides();
    public abstract void shapeInformation();

    public void totalAngle(){
        System.out.println("The shape: " + this.name + " has a total angle of " + (180 * (sides-2)) + " degrees");
    }
}
