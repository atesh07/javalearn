public class reversestring {
    public static void main(String[] args) {
        String a="racecar";
        String rev= new StringBuilder(a).reverse().toString();
        if(a.equals(rev)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
        System.out.println(rev);
    
    }
}