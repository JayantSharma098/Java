import java.util.*;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number b : ");
        int b = sc.nextInt();

        System.out.println("1 for Addtion");
        System.out.println("2 for substraction");
        System.out.println("3 for Multiple");
        System.out.println("4 for Divide");

        int Choice = sc.nextInt();

        switch(Choice){

            case 1 : System.out.println("Addition od a & b is: " + (a+b));
            break;
            case 2 : System.out.println("Substraction of a & b is : " + (a-b));
            break;
            case 3 : System.out.println("Multiple of a & b is : " + (a*b));
            break;
            case 4 : System.out.println("Dividation of a & b is :  " + (a/b));
            break;
            default: System.out.println("Invalid Input");

        }

    }
    
}
