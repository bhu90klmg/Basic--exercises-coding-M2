import java.util.Scanner;

public class M2Q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        char a =scn.next().charAt(0);
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
