import java.util.Scanner;
public class LatihanSoalUKL1Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("jarak tempuh barang");
        int jarak = scanner.nextInt();
        System.out.println("panjang barang");
        int panjang = scanner.nextInt();
        System.out.println("lebar barang");
        int lebar = scanner.nextInt();
        System.out.println("tinggi barang");
        int tinggi = scanner.nextInt();
        System.out.println("berat barang");
        int berat = scanner.nextInt();

        double tambahan = 0;
        if (jarak < 10 || jarak == 10) {
            tambahan += 4250*berat;
        }
        if (jarak >10) {
            tambahan +=6000*berat;
        }
       double volume = panjang * lebar * tinggi;
       if(volume <100) {
        tambahan += 5000;
       }

       int hasil = (int) (volume + jarak);
       System.out.println("total biaya tambahan :"+ tambahan);
       System.out.println("total biaya keseluruhan :"+ hasil);
         scanner.close();
       
}
}
