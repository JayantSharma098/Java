import java.util.Scanner;

public class avg {
    public static double avg(double a, double b, double c){
        return (a + b + c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first elements: ");
        int a = sc.nextInt();
        System.out.print("Enter the second elements: ");
        int b = sc.nextInt();
        System.out.print("Enter the third elements: ");
        int c = sc.nextInt();
        
        double average = avg(a, b, c);
    
        System.out.println("The average is: " + average);
    }
}
