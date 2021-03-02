import java.util.Scanner;

/* 19BAI10071
 * 
 * The situations in which considering abstract classes is benefecial, is when
 * the super or abstract class has some common properties of all other classes.
 * For example, in case of a class Animals, representing animals, there is no
 * animal object. There is a Human object, which in itself is inheriting from
 * Mammal object, which inherits from the Animal object. And in this case, the
 * concept of abstract classes helps simplify things.
 */
public abstract class graphicobject 
{
    // Graph object has a single dimension. 
    int singledim;
}

class rectangle extends graphicobject
{
    int dim2;
    /* Since rectangle inherits from Graphic object, we do not need to make a
     * provision for singledim
     */
    public void display()
    {
        System.out.println("Dimensions : " + singledim + " " + dim2);
    }
}

class line extends graphicobject
{
    int angle;
    public void display()
    {
        System.out.println(" Line's Length and Angle: " + singledim + angle);
    }
}

class bezier extends graphicobject
{
    String equation;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        equation = sc.nextLine();
    }
    public void output()
    {
        System.out.println("The Length and the Equation of the bezier are + " + singledim + equation);
    }
}

class circle extends graphicobject
{
    float circumference = (float) (2 * 3.14 * singledim);
    void display()
    {
        System.out.println("The radius and the circumference of the circle are + " + singledim + circumference);
    }
}