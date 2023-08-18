import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner cleo = new Scanner(System.in);
        System.out.print("masukkan kata yang mau di cek palindrome atau tidak: ");
        String str = cleo.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");
        int kiri = 0;
        int kanan = str.length() - 1;
        while (kiri < kanan) {
            if (str.charAt(kiri) != str.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }
        return true;
    }
}
