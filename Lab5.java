/* Program by Yatharth Shah. The Main objective is to represent Students.
 * The Superclass is student, and the classes Undergrad and Graduate inherit
 * from it. Then there are suitable functions for working with the class members
 */


class student
{
    private String name;
    private int id, gpa;

    public student(String nm, int iden, int mark)
    {
        name = nm;
        id = iden;
        gpa = mark;
    }

    void getName()
    {
        System.out.println("The Name of the Student is " + name);
    }
    String returnName()
    {
        return name;
    }
    void getGpa()
    {
        System.out.println("The Gpa of the Student " + name + " is " + gpa);
    }
    int returnGpa()
    {
        return gpa;
    }
    void inputName(String text)
    {
        name = text;
    }
    void inputGpa(int grade)
    {
        gpa = grade;
    }
    void inputId(int identification)
    {
        id = identification;
    }
    public String toString()
    {
        return "Name: " + name + " Gpa: " + gpa + " Id: " + id;
    }

}
class undergrad extends student
{
    int year;
    public undergrad(int id, String name, int gpa, int time)
    {
        super(name, id, gpa);
        year = time;
    }

    void setyear(int time)
    {
        if(time > 1970 && time < 2100)
        {
            year = time;
        }
        else
        {
            System.out.println("Please enter valid year");
        }
    }
    
    void getYear()
    {
        System.out.println("The year is " + year);
    }

    int returnYear()
    {
        return year;
    }
}
class graduate extends student
{
    String thesisTitle;
    public graduate(int id, String name, int gpa, String Title)
    {
        super(name,id, gpa);
        thesisTitle = Title;
    }
    public String getthesisTitle() {
        return thesisTitle;
    }
    public void setThesisTitle(String newthesisTitle) {
        this.thesisTitle = newthesisTitle;
    }
    public String toString() {
        return "Graduate " +super.toString()+"\nThesis: "+thesisTitle;
    }
}

class lab5
{
    public static void main(String[] args)
    {
        student s1 = new student("Yatharth", 1, 3);
        undergrad s2 = new undergrad(2, "Anant", 4, 2004);
        graduate s3 = new graduate(3, "Bot", 5, "Cybersecurity");
    }
}