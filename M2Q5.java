import java.util.Scanner;

public class M2Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.printf("%08d",Integer.parseInt(str));
    }
}


