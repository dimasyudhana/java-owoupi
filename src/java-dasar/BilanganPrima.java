import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        try (Scanner beta = new Scanner(System. in)) {
            System.out.print("masukkan sebuah bilangan untuk cek bilangan prima atau tidak: ");
            int nilai = beta.nextInt();
            if (nilai <= 1) {
                System.out.println("Bukan Bilangan Prima");
            } else {
                boolean isPrima = true;
                for (int i = 2; i <= Math.sqrt(nilai); i++) {
                    if (nilai % i == 0) {
                        isPrima = false;
                        break;
                    }
                }

                if (isPrima) {
                    System.out.println("Bilangan Prima");
                } else {
                    System.out.println("Bukan Bilangan Prima");
                }
            }
        }
    }
}
