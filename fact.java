import java.util.*;
public class fact {
    public static int factorial(int a){
        if(a==1||a==0){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("The factorial is: " + result);  

    }
}
