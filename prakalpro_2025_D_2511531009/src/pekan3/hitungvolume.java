package pekan3;

import java.util.Scanner;
public class hitungvolume {
    public static void main(String[] args) {
        //Rumus Volume Kerucut adalah V = 1/3 * \pi * r^2 * t
        double r, t, volume;//r=radius, t = tinggi, V = Volume
        final double PI = 3.14;
        
        Scanner keyboard = new Scanner(System.in);        
        System.out.println("===== Volume Kerucut =====");
        System.out.print("Masukkan jari-jari alas kerucut : ");
        r = keyboard.nextDouble();
        System.out.print("Masukkan tinggi kerucut         : ");
        t = keyboard.nextDouble();
        keyboard.close();
        
        volume = (double)1/3 * PI * r * r * t;
        System.out.println("Volume Kerucut                  : "+ volume);   
        
    }
}