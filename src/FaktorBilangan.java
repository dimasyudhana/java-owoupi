import java.util.Scanner;
public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner alpha = new Scanner(System. in);
        System.out.print("masukkan angka untuk menghitung faktor bilangan: ");
        int nilai = alpha.nextInt();
        int tambah = 0;
        for (int i = 1; i <= nilai; i++) {
            tambah++;
            if (nilai%tambah == 0) {
                System.out.println(tambah);
            }
        }
    }
}
