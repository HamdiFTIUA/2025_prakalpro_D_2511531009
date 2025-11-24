package pekan7_2511531009;
import java.util.Scanner;
public class tugasAlproPekan7_2511531009 {

	public static void main(String[] args) {
		Scanner meh = new Scanner (System.in);
		
		System.out.println("===== REGISTER AKUN BARU =====");
		
		System.out.print("Masukkan Username : ");
		String x = meh.nextLine();
		
		System.out.print("Masukkan Password :");
		String y = meh.nextLine();
		
		System.out.print("Masukkan Email :");
		String z = meh.nextLine();
		
		System.out.print("Masukkan PIN (6 digit) :");
		int w = meh.nextInt();
		
		Akun_2511531009 a = new Akun_2511531009();
		a.setUsername(x);
		a.setPassword(y);
		a.setEmail(z);
		a.setPIN(w);
		a.Cetak();
		int sybau=10;
		
		meh.close();
		
		System.out.println();
		System.out.println("--- Detail Akun ---");
		System.out.println("Username (lowercase) : " +x.toLowerCase());
		System.out.println("Email (Uppercase) : "+ z.toUpperCase());
		System.out.println("ID pengguna (Gabungan) : "+ x+w );
		System.out.println();
		System.out.println("--- Uji Tipe Data --- (PIN Anda : "+w+" ) ---");
		System.out.println("PIN (int) + 10   ="+( w+sybau)   );
		System.out.println("PIN (string) + \"10\"  = " + String.valueOf(w) + "10"); // Data Type Integer -> String

	}

}
