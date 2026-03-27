public class countvowels{
    public static void main(String[] arges){
        String name = "Ehtesham";
        int count =0;
        for(char c : name.toLowerCase().toCharArray())
        {
            if("aeiou".indexOf(c) !=-1){
                count++;
            }
           
        }
        System.out.println(count);


    }
}