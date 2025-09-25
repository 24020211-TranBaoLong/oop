import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random ran=new Random();
        int dice1=ran.nextInt(6)+1;
        int dice2=ran.nextInt(6)+1;
        System.out.println(dice1+dice2);
    }
}