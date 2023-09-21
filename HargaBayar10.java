import java.util.Scanner;

/**
 * HargaBayar10
 */
public class HargaBayar10 {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int harga, jumlah;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Diskon barang yang dibeli ");
        dis=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}