package week2tasks;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		int jumlahPeluru = 30;
		float kaliber = 5.8f;
		char tipeSenjata = 'R'; // R = Rifle
		boolean isLoaded = true; // Senjata terisi peluru

		System.out.println("======= STATUS SENJATA =======");
		System.out.println("Jumlah Peluru : " + jumlahPeluru);
		System.out.println("Kaliber       : " + kaliber + " mm");
		System.out.println("Tipe          : " + tipeSenjata + " (P=Pistol, R=Rifle, S=Shotgun)");
		System.out.println("Terisi?       : " + isLoaded);

		// Logika sederhana
		   if (isLoaded) {
			   		System.out.println("Status: SIAP TEMBAK!");
		        } else {
		            System.out.println("Status: AMAN (kosong)");
		        }
		    }
		

	}


