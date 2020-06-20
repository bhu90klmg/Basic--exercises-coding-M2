import java.util.Scanner;

public class M2Q21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int s=0;
        for (int i=1;i<=n;i++){
            int j=i;
            while (j%5==0){
                s++;
                j=j/5;
            }
        }
        System.out.println(s);
    }
}
