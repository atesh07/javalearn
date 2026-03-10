import java.util.*;
public class evenNo{
    public static void main(String[] arge){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num=input.nextInt();
        if(num==0){
            System.out.println("zero is not even nor odd");
        }
        else if (num%2==0) {
            System.out.println("The number is even");

        }
        else{
            System.out.println("The number is odd");    
        }
    }
}