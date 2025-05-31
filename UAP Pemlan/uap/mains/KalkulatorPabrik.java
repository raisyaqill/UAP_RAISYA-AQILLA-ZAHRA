package uap.mains;
import uap.models.Torus;
import uap.models.Sphere;
import java.util.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("RAISYA AQILLA ZAHRA");
        System.out.println("245150707111050");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
         System.out.print("Isikan Radius\t: ");
        // Membaca input radius mayor dari pengguna
        double majorRadiusTorus = scan.nextDouble();
        System.out.print("Isikan radius\t: ");
        // Membaca input radius minor dari pengguna
        double minorRadiusTorus = scan.nextDouble();
        System.out.println("=============================================");

        // Membuat objek Torus dengan radius mayor dan minor yang telah diinput
        Torus torus = new Torus(majorRadiusTorus, minorRadiusTorus);
        // Memanggil metode printInfo pada objek Torus untuk menampilkan informasi
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius\t: ");
        double radiusSphere = scan.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radiusSphere);
        sphere.printInfo();
        System.out.println("=============================================");
    }
}