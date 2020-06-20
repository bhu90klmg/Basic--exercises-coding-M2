import java.util.Scanner;

public class M2Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float n=scn.nextFloat();
        float max = n;
        float min = n;
       for (int i=1;i<10;i++){
            float m=scn.nextFloat();
           if (m>max){
                max=m;
           }
           if (m<min){
                min=m;
           }
       }
        System.out.print("max=");
        System.out.printf("%.2f\n",max);
        System.out.print("min=");
        System.out.printf("%.2f\n",min);
    }
}
