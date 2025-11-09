package pekan6_2511531009;
import java.util.*;
public class TugasPekan6_LemparDadu_2511531009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int target = 7;
        int tries = 0;
        boolean menang = false;
        boolean Running = true;

        while (Running) {
            tries++;

            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            int sum = dice1 + dice2;

            System.out.println(dice1 + " + " + dice2 + " = " + sum);

            if (sum == target) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + tries + " percobaan!");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("tidak")) {
                    Running = false;
                }
            }
        }

        if (!menang) {
            System.out.println("Anda gagal menang");
        }

        input.close();
    }
	
}

