import java.util.Scanner;

public class Gaji10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        System.out.println("Masukkan Jumlah Gaji Anda");
        gaji=input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji Anda");
        potGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja");
        JmlTdkMasuk=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
}
