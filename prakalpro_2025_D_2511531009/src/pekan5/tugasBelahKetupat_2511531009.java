package pekan5;

public class tugasBelahKetupat_2511531009 {

	public static void main(String[] args) {
		/* Dari contoh yang diberikan, terlihat bahwa kita memiliki 18 kolom dan 10 baris
		 * 16 dari 18 kolom tersebut menjadi lebar dari belah ketupat tersebut
		 * dan 4 baris atas dari 10 baris itu yang dimulai dari baris 2 simetris dengan 4 baris bawah yang dimulai dari 6 
		 * Oleh karena itu...
		 */
		int baris = 4;
		int lebar = baris * 4;
		
		// Bingkai atas
		for (int h = 1; h <= (lebar + 2); h++) {
			if (h == 1 || h == (lebar + 2)) {
				System.out.print("#");
			}
			else {
				System.out.print("=");
			}
		}
		System.out.println();
		
		// Setengah ketupat atas
        for (int i = 0; i < baris; i++) {
            int titik = i * 4; // 0, 4, 8, 12
            int selisih = 4 + titik; // "<>" + titik + "<>" = 2 + titik + 2
            int kosong = (lebar - selisih) / 2;

            System.out.print("|");
            for (int p = 0; p < kosong; p++) {
            	System.out.print(" ");
            }
            System.out.print("<>");
            for (int d = 0; d < titik; d++) {
            	System.out.print(".");
            }
            System.out.print("<>");
            for (int p = 0; p < kosong; p++) {
            	System.out.print(" ");
            }
            System.out.println("|");
        }

        // Setengah ketupat bawah (kebalikan dari setegah belah ketupat atas)
        for (int i = baris - 1; i >= 0; i--) {
            int titik = i * 4;
            int selisih = 4 + titik;
            int kosong = (lebar - selisih) / 2;

            System.out.print("|");
            for (int p = 0; p < kosong; p++) {
            	System.out.print(" ");
            }
            System.out.print("<>");
            for (int d = 0; d < titik; d++) {
            	System.out.print(".");
            }
            System.out.print("<>");
            for (int p = 0; p < kosong; p++) {
            	System.out.print(" ");
            }
            System.out.println("|");
        }
			
			// Bingkai bawah
			for (int h = 1; h <= (lebar + 2); h++) {
				if (h == 1 || h == (lebar + 2)) {
					System.out.print("#");
				}
				else {
					System.out.print("=");
				}
			}
	}

}
