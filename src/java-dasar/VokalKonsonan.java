/*
 * Java Program - Hitung jumlah vokal,konsonan, dan total karakter
 */
public class VokalKonsonan {
    public static void main(String[] args) {
        String str = "Alterra Indonesia.";
        String alpha = str.toLowerCase().replaceAll("[^a-z]","");
        int vokal = 0;
        int konsonan = 0;
        int totalKarakter = 0;
        for(char ch:alpha.toCharArray()) {
            totalKarakter++;
            if(ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o')
                vokal++;
            else
                konsonan++;
        }
        System.out.println("Jumlah Vokal : "+vokal);
        System.out.println("Jumlah Konsonan : "+konsonan);
        System.out.println("Total Karakter : "+totalKarakter);
    }
}
