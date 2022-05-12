/***************************************
 * File: Shape.java 	   
 * Date Created: 2022 / 05 / 09 
 * Author: Farhan Khan 	   
 * Program Description: This class contains the -
 * x and y coords of a shape. It also has two abstract -
 * methods. One will return the are of a shape, the other -
 * returns the perimeter of a shape.				   
 ***************************************/

abstract class Shape {
    private int left; //x-coordinate
    private int bottom; //y-coordinate

    //default constructor
    public Shape(){this(0, 0);}

    //custom constructor
    public Shape(int left, int bottom){
        this.left = left;
        this.bottom = bottom;
    }

    //Getters & Setters
    public int getLeft(){return this.left;}
    public int getBottom(){return this.bottom;}
    public void setLeft(int v){this.left = v;}
    public void setBottom(int v){this.bottom = v;}

    //toString
    public String toString(){return 
        String.format("base: (%d,%d) ", this.left, this.bottom);}

    //returns the area of a shape
    public abstract int area();

    //returns the perimeter of a shape
    public abstract int perimeter();

    //this method returns the author of the program
    public static String info(){return "Farhan Khan";}

    //this method will display info about the Shape class
    public static void classInfo(){
        System.out.println("\nClass: Shape.java");
        System.out.println("public Shape()");
        System.out.println("public Shape(int left, int bottom)");
        System.out.println("public int getLeft()");
        System.out.println("public int getBottom()");
        System.out.println("public void setLeft(int v)");
        System.out.println("public void setBottom(int v)");
        System.out.println("public String toString()");
        System.out.println("public abstract int area()");
        System.out.println("public abstract int perimeter()\n");
    }
}