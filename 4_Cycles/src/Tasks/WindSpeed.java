package Tasks;
import java.util.Scanner;

public class WindSpeed {
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int speed = read.nextInt();

            int speedRound = (int)Math.round(speed*3.6);
            System.out.println(speedRound);
        }
    }
}
