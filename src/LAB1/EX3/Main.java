package LAB1.EX3;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++){
            array[i] = rand.nextInt(100);
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
