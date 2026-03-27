public class string1{
    public static void main(String[] arges){
        String name = "Ehtesham Anwar";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("Anwar"));
        System.out.println(name.charAt(0));
        String name2 = "saad"; 
        System.out.println(name2.trim());
        System.out.println(name2);
       //for check both string are same or not
        System.out.println(name2.equals(name));
        System.out.println(name2.length());
        System.out.println(name2.replace("saad","Ehtesham"));
        String hey="Ehtesham";
        String rev = new StringBuilder(hey).reverse().toString();
        System.out.println(rev);
    }
}