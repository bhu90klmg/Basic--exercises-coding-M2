import java.util.Scanner;

public class M2Q15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        double sum=0;
        int b =1;
        for (int i=1;i<=n;i++){
            double c ;
            double a = (2*i-1)*(2*i);
            c =b/a;
            sum = sum+c;
        }
        System.out.println(sum);
    }
}
