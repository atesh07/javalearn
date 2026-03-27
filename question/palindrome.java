public class palindrome{
    public static void main(String[] arges){
        String word="racecar";
        String rev= new StringBuilder(word).reverse().toString();
        if(rev.equals(word)){
            System.out.println("yes this is palindrome");
        }
        else 
        {
            System.out.println("not palindrome");
        }

    }
}