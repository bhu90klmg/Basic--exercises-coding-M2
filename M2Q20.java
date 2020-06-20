import java.util.Scanner;

public class M2Q20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        for (int i=2;i<=n;i++){
            boolean flag=true;
                for (int k=2;k<i;k++){
                    if (i%k==0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.println(i);
            }
        }
    }
}
