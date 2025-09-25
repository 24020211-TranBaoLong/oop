import java.util.Scanner;
public class SumOfSines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t;
        t=input.nextDouble();
        double rad=Math.toRadians(t);
        double sin1=Math.sin(2*rad);
        double sin2=Math.sin(3*rad);
        System.out.println(sin1+sin2);

    }
}