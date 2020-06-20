import java.util.Scanner;

public class M2Q23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int j ;
        while (n%10>0){
            j=n%10;
            n=n/10;
            System.out.print(j);
        }
    }
}
