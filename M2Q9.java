import java.util.Scanner;

public class M2Q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int a1 =0;
        int m  = scn.nextInt();
        int a2 =0;
        for (int i=1;i<=n;i++){
            if (n%i==0 && m%i==0){
                a1=i;
            }
        }
        System.out.println(a1);
        for (int k=n*m;k>=n;k--){
            if (k%n==0 && k%m==0){
                a2=k;
            }
        }
        System.out.println(a2);
    }
}
