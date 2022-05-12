/***************************************
 * File: Main.java 	   
 * Date Created: 2022 / 05 / 09 
 * Author: Farhan Khan 	   
 * Program Description:		   
 * Tester class for the Rectangle.java and Shape.java classes
 * The link below is a visual diagram of the tester class (sorry it's not animated😉)
 * https://jamboard.google.com/d/1Vojy059HaiiR3IP0OCkQwbfqZOHICdVVdbOaPWvOyao/edit?usp=sharing
 ***************************************/

class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(0,0,0,0);
        r1.set(0,0,6,6);
        Rectangle r2 = new Rectangle(20,20,20,15);
        Rectangle r3 = new Rectangle(4,6,7,1); 
        Rectangle r4 = new Rectangle(2,1,5,2); 
        Rectangle r5 = new Rectangle(-5,-1,5,4);
        Rectangle r6 = new Rectangle(0,-4,2,5);
        Rectangle r7 = new Rectangle(-5,-1,-5,4);
        Rectangle r8 = new Rectangle(-5,-1,5,-4);
        Rectangle r9 = new Rectangle(5,-4,7,4);
        Rectangle r10 = new Rectangle(6,-3,5,2);
        Rectangle r11 = new Rectangle(9,-2,2,4);
        Rectangle r12 = new Rectangle(-5,-2, 5,8);
        Rectangle r13 = new Rectangle(6,3,4,2);
        Rectangle r14 = new Rectangle(7,-5,6,8);

        System.out.println("\n" + r1 
        + "| Expected: base: (0,0) w:6 h:6\n");

        System.out.println(Rectangle.intersection(r1,r2) //check no intersection
        + " | Expected: base: (0,0) w:0 h:0 \n");

        System.out.println(Rectangle.intersection(r1,r3) //check partial touching on top
        + " | Expected: base: (4,6) w:2 h:0 \n");

        System.out.println(Rectangle.intersection(r1,r4) //check a intersection
        + " | Expected: base: (2,1) w:4 h:2 \n");

        System.out.println(Rectangle.intersection(r1,r5) //check left side touching (negative start point)
        + " | Expected: base: (0,0) w:0 h:3 \n");

        System.out.println(Rectangle.intersection(r1,r6) //check intersection from bottom (negative start point)
        + " | Expected: base: (0,0) w:2 h:1 \n");

        System.out.println(Rectangle.intersection(r5,r7) //check negative width detection (negative start point)
        + " | Expected: base: (-5,-1) w:0 h:4 \n");

        System.out.println(Rectangle.intersection(r4,r6) //check if only the corners of 2 rectangles are touching
        + " | Expected base: (2,1) w:0 h:0\n");

        System.out.println(Rectangle.intersection(r5,r8) //check negative height detection (negative start point)
        + " | Expected: base: (-5,-1) w:5 h:0 \n");
       
        System.out.println(r9 + " r9 CONTAINS r10 " + r10 + " ? = " + r9.contains(r10) //check if r10 is inside r9
        + " | Expected: true\n");
        
        System.out.println(r9 + " r9 CONTAINS r11 " + r11 + " ? = " + r9.contains(r11) //check if r11 is inside r9
        + " | Expected: false\n"); 

        System.out.println(r12 + " r12 CONTAINS r5 " + r5 + " ? = " + r12.contains(r5) //check if r5 is inside r12
        + " | Expected: true\n");

        System.out.println(r14 + " r14 CONTAINS r11 " + r11 + " ? = " + r14.contains(r11) //check if r11 is inside r14
        + " | Expected: true\n");

        System.out.println(r14 + " r14 CONTAINS r10 " + r10 + " ? = " + r14.contains(r10) //check if r10 is inside r14
        + " | Expected: false\n");

        System.out.println("TOTAL PERIMETER OF r1 and r4: " + r1 + " | " + r4  + " = " 
        + Rectangle.totalPerimeter(r1, r4) + " | Expected 26\n"); //check total perimeter of r1 & r4

        System.out.println("TOTAL PERIMETER OF r1 and r3: " + r1 + " | " + r3  + " = " 
        + Rectangle.totalPerimeter(r1, r3) + " | Expected 36\n"); //check total perimeter of r1 & r3

        System.out.println("TOTAL PERIMETER OF r1 and r12: " + r1 + " | " + r12  + " = " 
        + Rectangle.totalPerimeter(r1, r12) + " | Expected 38\n"); //check total perimeter of r1 & r12

        System.out.println("TOTAL PERIMETER OF r1 and r9: " + r1 + " | " + r9  + " = " 
        + Rectangle.totalPerimeter(r1, r9) + " | Expected 44\n"); //check total perimeter of r1 & r9

        System.out.println("TOTAL PERIMETER OF r1 and r13: " + r1 + " | " + r13  + " = " 
        + Rectangle.totalPerimeter(r1, r13) + " | Expected 32\n"); //check total perimeter of r1 & r13

        System.out.println("TOTAL PERIMETER OF r14 and r11: " + r14 + " | " + r11  + " = " 
        + Rectangle.totalPerimeter(r14, r11) + " | Expected 28\n"); //check total perimeter of r14 & r11

        System.out.println("TOTAL PERIMETER OF r12 and r5: " + r12 + " | " + r5  + " = " 
        + Rectangle.totalPerimeter(r12, r5) + " | Expected 26\n"); //check total perimeter of r12 & r5

        System.out.println("\nPROGRAM INFORMATION:\n" 
                           +"----------------------");
        Shape.classInfo();
        Rectangle.classInfo();
        
        System.out.println("Made By: " + Shape.info() + "😁");
    }
}