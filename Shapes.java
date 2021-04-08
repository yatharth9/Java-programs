// Program by Yatharth Shah 19BAI10071

import java.io.*;

abstract class Shape
 { 
 void draw() 
 { 
 System.out.println("Shape draw()"); 
 } 
 void erase() 
 { 
    System.out.println ("Shape erase()"); 
    } 
    } 
   class Circle extends Shape 
    { 
    void draw() 
    { 
    System.out.println ("Circle draw()"); 
    } 
   void erase() 
    { 
    System.out.println ("Circle erase()"); 
    } 
   } 
   class Triangle extends Shape 
    { 
    void draw() 
    { 
    System.out.println("Triangle erase()"); 
    } 
   } 
   class Square extends Shape 
    { 
    void draw() 
    { 
    System.out.println ("Square draw()"); 
    } 
   void erase() 
    { 
    System.out.println ("Square erase()"); 
    } 
   } 
class Shapes
{ 
    public static void main(String[] args)
    {
        Shape newcircle = new Circle();
        Shape newtriangle = new Triangle();
        Shape newsquare = new Square();
        
        newcircle.draw();
        newtriangle.draw();
        newsquare.draw();

        System.out.println(" ");

        newcircle.erase();
        newtriangle.erase();
        newsquare.erase();
    

    }
} 