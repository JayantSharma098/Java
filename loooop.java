
import java.util.Scanner;


public class loooop{
    public static void main(String[] args){
        // int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // int x = 0;

        // for(int i = 0 ; i<=10 ; i++){
        //     System.out.println(n);
        //     n++;
        // }
        // for(int i = 0 ; i<=10 ; i++){
        //     System.out.print(i + " ");
        // }
        // while(i<=10){
        //     System.out.print(i+" ");
        //     i++;
        // }
        // do { 
        //     System.out.print(i + " ");
        //     i++;
        // } while (i<=10);
        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
        
    }
}
