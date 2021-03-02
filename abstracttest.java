abstract class A
{
    abstract void callme();

    void showme()
    {
        System.out.println(" I am non abstract method");
    }
}

class abs extends A
{
    void callme()
    {
        System.out.println("Calling A");
    }
}