public class IfStatement {
    public static void main(String[] args) {
        var absen = 70;
        var nilai = 90;

        var lulusAbsen = absen >= 80;
        var lulusNilai = nilai >= 80 ;

        var lulus = lulusAbsen && lulusNilai;

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
