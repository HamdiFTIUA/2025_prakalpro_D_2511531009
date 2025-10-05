package pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511531009 {
    public static void main(String[] args) {
        String namaPengirim;
        double beratPaket, biayaDasar, biayaJarak, subtotal, biayaLayanan, 
        biayaJenisPaket, totalSebelumDiskon, diskon = 0, totalBiaya;
        int jarakPengiriman, jenisLayanan, jenisPaket, persenL;
        
        // Konstanta biaya (i),(ii)
        final double biayaDasarPersatuan = 45000.0 / 7;
        final int biayaJarakPersatuan = 600;
        String layananText = "";
        String paketText = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Pengirim: ");
        namaPengirim = input.nextLine();
        
        System.out.print("Berat Paket (kg): ");
        beratPaket = input.nextDouble();
        if (beratPaket > 30) {
            System.out.println("Berat paket melebihi kargo");
            input.close();
        } else if (beratPaket <= 30) {
        System.out.print("Jarak Pengiriman (km): ");
        }
        jarakPengiriman = input.nextInt();
        
        System.out.print("Jenis Layanan (1=Reguler, 2=Express, 3=Same Day): ");
        jenisLayanan = input.nextInt();
        
        biayaDasar = beratPaket * biayaDasarPersatuan;
        biayaJarak = jarakPengiriman * biayaJarakPersatuan;
        subtotal = biayaDasar + biayaJarak; 
        
        switch (jenisLayanan) {
            case 1:
                biayaLayanan = 0.25 * subtotal;
                persenL = 25;
                break;
            case 2:
                biayaLayanan = 0.50 * subtotal;
                persenL = 50;
                break;
            case 3:
                biayaLayanan = 0.75 * subtotal;
                persenL = 75;
                break;
            default:
                System.out.println("Format Jenis Layanan Salah");
                biayaLayanan = 0;
                persenL = 0;
                System.exit(0);        
        }
        
        System.out.print("Jenis Paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik): ");
        jenisPaket = input.nextInt();
        
        switch (jenisPaket) {
            case 1:
                biayaJenisPaket = 5000;
                break;
            case 2:
                biayaJenisPaket = 10000;
                break;
            case 3:
                biayaJenisPaket = 15000;
                break;
            default:
                System.out.println("Format Jenis Paket Salah");
                biayaJenisPaket = 0;
                System.exit(0);
        }
        
        totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;
        
        if (beratPaket < 5) {
            diskon = 0;
        }
        if (beratPaket >= 5 && beratPaket < 10) {
            diskon = -0.10 * totalSebelumDiskon;
        }
        if (beratPaket >= 10 && beratPaket <= 30) {
            diskon = -0.20 * totalSebelumDiskon;
        }

        
        totalBiaya = totalSebelumDiskon + diskon;
        
        System.out.println("===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim  		 : " + namaPengirim);
        System.out.println("Berat Paket		 : "+beratPaket+" kg");
        System.out.println("Jarak Pengiriman 	 : " + jarakPengiriman + " km");
        
        switch (jenisLayanan) {
            case 1: layananText = "Reguler"; break;
            case 2: layananText = "Express"; break;
            case 3: layananText = "Same Day"; break;
        }
        System.out.println("Jenis Layanan	 	 : " + layananText);
        
        switch (jenisPaket) {
            case 1: paketText = "Dokumen"; break;
            case 2: paketText = "Barang Biasa"; break;
            case 3: paketText = "Barang Elektronik"; break;
        }
        input.close();
        System.out.println("Jenis Paket	 	 : " + paketText);
        
        System.out.println("--------------------------------------");
        System.out.println("Biaya Dasar		 : Rp "+ biayaDasar);
        System.out.println("Biaya Jarak		 : Rp "+ biayaJarak);
        System.out.println("Subtotal		 : Rp "+ subtotal);
        System.out.println("Biaya Layanan ("+persenL+") 	 : Rp "+biayaLayanan);
        System.out.println("Biaya Jenis Paket 	 : Rp "+ biayaJenisPaket);
        System.out.println("Total Sebelum Disc.	 : RP "+ totalSebelumDiskon);
        System.out.println("Diskon			 : Rp "+ diskon );
        System.out.println("--------------------------------------");
        System.out.println("TOTAL BIAYA		 : Rp "+ totalBiaya);
        
        
    }
}