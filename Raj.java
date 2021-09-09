import java.util.Scanner ;
public class Raj
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                for(int k=1;k<i;k++){
                    System.out.print(" ");
                }
                for(int j=i;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for(int k=i;k<2*n;k++){
                    System.out.print(" ");
                }
                for(int j=n;j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
