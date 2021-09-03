# Java_task
import java.util.Scanner ;
public class Program
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m=n*2;
        for(int i=1;i<=m;i++){
        if(i<=n){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
      }
      else {
            for(int j=i;j<m;j++){
                System.out.print(" ");
            }
            for(int j=n;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }}
    }
}
