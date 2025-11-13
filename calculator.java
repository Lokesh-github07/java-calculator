import java.util.Scanner;

public class calculator {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the number (or 'x' to exit): ");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("x"))
        {
            System.out.println("Exiting calculator....");
            break;
        }
        double  num1;
        try {
            num1=Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input ! please enter a number or 'x' to exit .");
            continue;
        }
        System.out.println("Enter the number : ");
        double num2 = sc.nextInt();
        System.out.println("Enter the operator : ");
         char op =sc.next().charAt(0);
       double result;
       switch (op) {
        case '+' -> result=num1+num2;
        case '-' -> result=num1-num2;
         case '*' -> result=num1*num2;
         case '/' -> result=num2 !=0 ? num1/num2:
            Double.NaN;
         case '%' -> result=num1%num2;
       
        default -> {
            System.out.println("Invalid operator!");
            continue;
            }
       }
       System.out.println("Result : " + result);
       System.out.println();
    } 
}
}