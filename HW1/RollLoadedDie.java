import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RollLoadedDie {
    public static void main(String[] args) {
        Random random = new Random();
        double r=random.nextDouble();
        int res=0;
        if (r < 0.125) {
            res = 1;
        } else if (r < 0.250) {
            res = 2;
        } else if (r < 0.375) {
            res = 3;
        } else if (r < 0.500) {
            res = 4;
        } else if (r < 0.625) {
            res = 5;
        } else {
            res = 6;
        }
        System.out.println(res);

    }
}