/***************************************
 * File: Rectangle.java 	   
 * Date Created: 2022 / 05 / 09 
 * Author: Farhan Khan 	   
 * Program Description: This class contains methods such as -		   
 * area which returns the area of the rectangle, perimeter, -
 * intersection which will return a rectangle with the common -
 * of 2 rects, total perimeter of 2 rects and a contains -
 * method which will return true or false.
 ***************************************/

class Rectangle extends Shape {
    private int width;
    private int height;

    //default constructor
    public Rectangle(){this(0, 0, 0, 0);}

    //custom constructor
    public Rectangle(int left, int bottom, int width, int height){
        super(left, bottom);
        this.width = width > 0 ? width : 0;
        this.height = height > 0 ? height : 0;
    }

    //Getters & Setters
    public int getWidth(){return this.width;}
    public int getHeight(){return this.height;}
    public void set(int l, int b, int w, int h){
        setLeft(l);
        setBottom(b);
        this.width = w > 0 ? w : 0;
        this.height = h > 0 ? h : 0;
    }
    
    //toString
    public String toString(){return 
        String.format(super.toString() + "w:%d h:%d", this.width, this.height);}

    //returns the area of the calling rectangle
    public int area(){return this.width * this.height;}

    //returns the perimeter of the calling rectangle
    public int perimeter(){
        //check to see if the width or heigth are 0
        if(height == 0 && width > 0){return width;}
        if(height > 0 && width == 0){return height;}
        return (width + height) * 2;
    }

    /*this method will return a new rectangle object - 
      formed by the area common to the two rectangles */
    public static Rectangle intersection(Rectangle r1, Rectangle r2){
        //calculate the rightmost 'left' coord
        int rML = Math.max(r1.getLeft(), r2.getLeft());
        //calculate the leftmost left of the 2 rects
        int lML = Math.min(r1.getLeft() + r1.width, r2.getLeft() + r2.width);
        //calculate the highest y-coord out of the 2 rects
        int topYDir = Math.max(r1.getBottom(), r2.getBottom() );
        //calculate the lower positioned rectangle
        int bottomYDir = Math.min(r1.getBottom() + r1.height, r2.getBottom() + r2.height);

        /*if there is overlap, then return a new rectangle - 
         * representing the common area between them
         * we use <= to also account for the rectangles -
         * whos sides are touching but no direct overlap*/
        if(rML <= lML && topYDir <= bottomYDir){
            return new Rectangle(rML, topYDir, lML-rML, bottomYDir-topYDir);
        } else{ // if there is no overlap or touching sides, return a rectangle with 0 as all fields
            return new Rectangle();
        }
    }

    //this method returns the total perimeter of the exterior sides
    public static int totalPerimeter(Rectangle r1, Rectangle r2){
        /*check if one rectangle contains the other 
         * if so, return the perimeter of the larger rect*/
        if(r1.contains(r2)){return r1.perimeter();}
        if(r2.contains(r1)){return r2.perimeter();}

        //declare a variable to hold the rectangle formed by the intersection
        Rectangle intersectedRect = intersection(r1, r2);

        //if the intersectedRect is only a line, subtract it twice
        if(intersectedRect.height == 0 || intersectedRect.width == 0){
            return ((r1.perimeter() + r2.perimeter()) - (2*intersectedRect.perimeter()));
        }
        
        /*calculate the total perimeter of the outside lenghts
         *if there is no intersection, 'intersectedRect.perimeter()' will be 0*/
        return ((r1.perimeter() + r2.perimeter()) - intersectedRect.perimeter());
    }

    //this method will check if a rectangle is contained by another rect
    public boolean contains(Rectangle r2){
        //if r2 is contained within the calling rectangle return true
        return ((r2.getLeft() + r2.width) <= (this.getLeft() + this.width) 
           && r2.getLeft() >= this.getLeft()
           && r2.getBottom() >= this.getBottom()
           && (r2.getBottom() + r2.height) <= (this.getBottom() + this.height));
    }

    //this method will display info about the rectangle class
    public static void classInfo(){
        System.out.println("\nClass: Rectangle.java");
        System.out.println("public Rectangle()");
        System.out.println("public Rectangle(int left, int bottom, int width, int height)");
        System.out.println("public int getWidth()");
        System.out.println("public int getHeigth()");
        System.out.println("public void set(int l, int b, int w, int h)");
        System.out.println("public String toString()");
        System.out.println("public int area()");
        System.out.println("public int perimeter()");
        System.out.println("public static Rectangle intersection(Rectangle r1, Rectangle r2)");
        System.out.println("public static int totalPerimeter(Rectangle r1, Rectangle r2)");
        System.out.println("public boolean contains(Rectangle r2)\n");
    }     
 }