public class nextedLoop{
    public static void main(String[] arges){
        System.out.println("hello");
        boolean hasId=false;
        boolean vip = true;
        int age = 20;
        if(age>=18){
           if(hasId){
            System.out.println("You are good to go ");
           }else if(vip){
            System.out.println("You are vip you should you now ");
           }
           else {
            System.out.println("Id required");
           }
        } 
        else{
            System.out.println("You are underage");
        }


    }
}