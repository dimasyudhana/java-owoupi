public class IfStatement {
    public static void main(String[] args) {
        int absen = 70;
        int nilai = 90;

        boolean lulusAbsen = absen >= 80;
        boolean lulusNilai = nilai >= 80 ;

        boolean lulus = lulusAbsen && lulusNilai;

        if(absen >= 80 && nilai >= 80){
            System.out.println("selamat anda lulus bro"); //jika true ya hasilnya ini
        } else {
            System.out.println("coba lagi bro"); //jika false ya hasilnya ini
        }

        if(absen >= 80 && nilai >= 80) {
            System.out.println("A");
        } else if(absen >= 70 && nilai >= 70) {
            System.out.println("B");
        } else if(absen >= 60 && nilai >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
