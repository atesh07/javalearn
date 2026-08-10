public class  boolian{
    public static void main(String[] args){
        int age = 20;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");  
        }

     String result = (age>=18) ? "you are eligible to vote"+ " "+ age: "you are not eligible to vote";
     System.out.println(result);       

 
    }

    }