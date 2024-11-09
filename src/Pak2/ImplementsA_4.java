package Pak2;

import Pak1_IA.InterfaceA;

public class ImplementsA_4 implements InterfaceA {
    protected final double CONST_A = 3.2; 
    protected final int CONST_B = 64;
    private String label;
    private int x;

    public ImplementsA_4(){
        x = 0;
        label = "Default";
    }

    public ImplementsA_4(String inputstr, int y){
        label = inputstr;
        x = y;
    }
    
    public void TaskA_A() {
        System.out.print("Task A_B here divides numbers");
    }
    public int TaskA_B(int inputA, int inputB) {
        return(inputA / inputB);
    }
    public int TaskA_B(){
        return(TaskA_B(CONST_B,x));
    }
    public double getconst(){
        return(CONST_A);
    }
    public String getLable(){
        return(label);
    }
    public void setLabel(String newLabel){
        label = newLabel;
    }
    public int getX(){
        return(x);
    }
    public void setX(int y){
        x = y;
    }
}