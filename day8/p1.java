import java.util.*;
public class p1{
    public static void main(String[] arges){
        System.out.println("----coding challenges----");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("["+num +"]"+" Even No....");
        } else {
            System.out.println("["+num +"]"+" Odd No...");
        }


    }
}