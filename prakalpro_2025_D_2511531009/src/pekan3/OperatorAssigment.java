package pekan3;
import java.util.Scanner;
public class OperatorAssigment {
	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt(); //input 10
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt(); //input 5
		keyboard.close();
		System.out.println("Assigment penambahan");
		A1 += A2; //penambahan, sekarang A1 = 15
		System.out.println("Penambahan :" + A1);
		System.out.println("Assigment pengurangan");
		A1 -= A2; //pengurangan, sekarang A1 = 10
		System.out.println("Pengurangan :" + A1);
		System.out.println("Assigment perkalian");
		A1 *= A2; //perkalian, sekarang A1 = 50
		System.out.println("Perkalian : " + A1);
		System.out.println("Assigment Hasil Bagi");
		A1 /= A2; //pembagian, sekarang A1 = 10
		System.out.println("Pembagian : " + A1);
		System.out.println("Assigmet Sisa Bagi");
		A1 %= A2; //sisa bagi, sekarang A1 = 0
		System.out.println("Sisa Bagi : " + A1);
	}

}
