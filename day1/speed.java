import java.util.*;
public class speed{
    public static void main(String[] args){
        System.out.println("Racing Zone");
        double speed,distance,time;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the distance :");
        distance=input.nextDouble();
        System.out.println("Enter time ");
        time=input.nextDouble();
        speed=distance/time;
        System.out.printf("speed : %.2f km/h ",speed);
        
    }
}