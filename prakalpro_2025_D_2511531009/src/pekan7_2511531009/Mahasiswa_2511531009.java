package pekan7_2511531009;

public class Mahasiswa_2511531009 {

		// global variable
			private int nim;
			private String nama, nim2;
			
			// Creating mutator (setter)
			public void setNim (int nim) {
				this.nim=nim;
			}
			public void setNim2 (String nim2) {
				this.nim2=nim2;
			}
			public void setNama (String nama) {
				this.nama=nama;
			}
			
			// Creating accessor (getter)
			public int getNim() {
				return nim;
			}
			public String getNim2() {
				return nim2;
			}
			public String getNama() {
				return nama;
			}
			
			// Another method
			public void Cetak() {
				System.out.println("Nim : " + nim);
				System.out.println("Nama : " + nama);
			}
			public void Cetak2() {
				System.out.println("Nim : " + nim2);
				System.out.println("Nama : " + nama);
			}

}

