import java.util.Scanner;

public class M2Q17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int s=0;
        while (n>0){
            s++;
            sum=sum + n%10;
            n=n/10;
        }
        System.out.println(s);
        System.out.println(sum);
    }
}
