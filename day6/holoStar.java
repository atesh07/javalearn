public class holoStar{
    public static void main(String[] arges){
        System.out.println("Holo Squre ");
        int n=8;
        for(int i = 0 ; i <n ; i++){
            for(int j =0; j< n;j++){
                if(i==n-1|| j==n-1 ||j==0||i==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        for(int i = n-1; i >0 ;i--){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
            
        
        }
    }
}