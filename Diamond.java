/*
 * developed by Akash modanwal
 */
public class Diamond { // pattern to print diamond
    public static void diamond(int n) {
       for(int i =1;i<=n;i++){
        for(int j = 1;j<=n-i;j++){
            System.out.println(" ");
        }
        for(int j = 1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
       } 
       for(int i =n;i>=1;i--){
        for(int j =1;j<=(n-i);j++){
            System.out.println(" ");
        }
        for(int j= 1;j<=(2*i)-1;j++){
            System.out.println();
        }
       }
    }
    public static void main(String[] args) {
        diamond(8);
    }
}
