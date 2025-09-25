import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        x=input.nextInt();
        y=input.nextInt();
        double distance=Math.sqrt(x*x+y*y);
        System.out.println("distance from ("+x+","+y+") to (0,0) is "+distance);
        }
}