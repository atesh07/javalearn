import java.util.*;
public class helloWorld{
    public static void main(String[] args){
        System.out.println("Welcome to java programming");
        int a=10;
        int b=30;
        int sum=a+b;

        System.out.println("hello " + sum);
        if(a<b){
            System.out.println("a is less then b");
        }else{
            System.out.println("a is not less than b");
        }
        for(int i =1;i<=100;i++){
          
          if(i%2==0 && i%3==0){
            System.out.println(i);
          }
        }
        int n=10;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}