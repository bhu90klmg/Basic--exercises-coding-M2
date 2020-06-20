import java.util.Scanner;

public class M2Q24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum=0;
        int a=0;
            for (int i=1;i<=n;i++){
                sum =sum+i;
                if (sum>n){
                    a=i-1;
                    break;
                }
        }
            if (n == 1){
                System.out.println("1");
            }else{

            System.out.println(a);
        }
    }
}
