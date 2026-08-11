import java.util.*;
public class  arrayD{
    public static void main(String[] arges){
        System.out.println("----Arrays-----");

        String[] fruits = {"Apple","Banana","Watermelon","Pear"};
        System.out.println(fruits[0].toUpperCase());
        for(int i = 0; i<fruits.length;i++){
            System.out.println(fruits[i].toUpperCase());
        }
        fruits[0]="kela";
        System.out.println(fruits[0]);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //null array with size
        int [] cars = new int[n];
       
        for(int i = 0; i < n; i++){
            cars[i] = input.nextInt();
        }
        for(int j = 0;j<n;j++){
            System.out.println(cars[j]);
        }



    }
}