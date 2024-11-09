package Pak4;

import Pak1_IA.InterfaceB;

public class ImplementsB implements InterfaceB {

    private int ID;
    protected float fltA;
    
    public void TaskB_A() {
        System.out.println("Task B_B concatenates strings.");
    }

    public String TaskB_B(String inputA, String inputB) {
        String output = inputA + inputB;
        return(output);
    }

    public String TaskB_B(){
        return(TaskB_B("Hello, ","World!"));
    }
    public void setID(int newID){
        ID = newID;
    }
    public int getID(){
        return(ID);
    }
    public void setFloat(float newflt){
        fltA = newflt;
    }
    public float getFloat(){
        return(fltA);
    }
}
