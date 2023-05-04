package Tasks;

import java.util.Scanner;

public class TheGlassHalfEmptyOrHalfFull {
    public static void main(String[] args) {
        double glass = 0.5;
        int roundGlass = -1;
        try(Scanner scan = new Scanner(System.in)){
            while (scan.hasNextBoolean()){
                boolean x = scan.nextBoolean();
                if(x == true){
                    roundGlass = (int)Math.ceil(glass);
                    System.out.println(roundGlass);
                }
                else{
                    roundGlass =(int)Math.floor(glass);
                    System.out.println(roundGlass);
                }
            }
        }
    }
}
