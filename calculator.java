public class calculator {
    public static void main(String[] args) {
        System.out.println(args.length);
        int x = args.length;
        for(int i = 0; i < x; i++)
        {
            System.out.println(args[i]);
        }
        if(args.length < 2 || args.length > 3)
        {
            System.out.println("Error: Usage: num1 operator num2");
            System.out.println("Example: 1 + 2");
            System.exit(1);
        }
        if(args.length == 3)
        {
            int num1 = Integer.parseInt(args[0]);
            char oper = args[1].charAt(0);
            int num2 = Integer.parseInt(args[2]);
            switch(oper)
            {
                case '+':
                int ans0 = num1 + num2;
                System.out.println(ans0 + " = " + num1 + oper + num2);
                break;

                case '-':
                int ans1 = num1 - num2;
                System.out.println(ans1 + " = " + num1 + oper + num2);
                break;

                case '*':
                int ans2 = num1 * num2;
                System.out.println(ans2 + " = " + num1 + oper + num2);
                break;

                case '/':
                float ans3 = (float)num1 / (float)num2;
                System.out.println(ans3 + " = " + num1 + oper + num2);
                break;

                default:
                System.out.println("Error: Invalid operator");
                System.exit(-1);
            }
        }
        if(args.length == 2)
        {
            if(args[1].charAt(0) != '!')
            {
                System.out.println("Error! Invalid operator. ");
                System.out.println("Example for factorial use 4! ");
            }
            int no = Integer.parseInt(args[0]);
            int mul = 1;
            while(no > 0)
            {
                mul *= no;
                no --;
            }
            System.out.println("The factorial of " + args[0] + " is " + mul);
        }
    }
}