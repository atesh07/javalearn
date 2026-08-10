public class string{
    public static void main(String[] args){
        String name = "Ehtesham";
        String a="apple";
        String b="banana";
        String ab="1";
        int x=1;
        System.out.println(a.equals(b));
        System.out.println(ab.equals(String.valueOf(x)));
        System.out.println(a.compareTo(b));
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.charAt(0));
        // System.out.println(name.indexOf("A"));
        // System.out.println(name.lastIndexOf("a"));
        System.out.println(name.replace("Ehtesham", "Ali"));
        String name1="    nishi    ";
        System.out.println(name1.trim());
        String hehe="weds\b";

     // concatination rules 
     System.out.println(name+ ""+name1.trim());
     System.out.println(name.concat(name1.trim()));
     System.out.println(name.concat(hehe).concat(name1.trim()));
    }
}