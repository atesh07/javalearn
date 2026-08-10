import java.util.*;
public class loop{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("enter the number n:");
       int n = input.nextInt();
       int i=1;
       double sum=0;

        while(i<=n){
            System.out.println(i);
            sum+=i;
            i++;
        }
        double sum2 = (double) sum;
        System.out.println("The sum is: " + sum);
        System.out.println(sum2);
    }
}