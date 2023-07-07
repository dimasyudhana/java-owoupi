public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "H";
        switch (nilai){
            case "A":
                System.out.println("Wow mantab lulus bro");
                break;
                // kalau di golang pakai commas untuk 2 kondisi ok
            case "B":
            case "C":
                System.out.println("yaa lumayan bro");
                break;
            case"D":
                System.out.println("coba lagi bro");
                break;
            default:
                System.out.println("salah jurusan mungkin bro");
        }
    }
}
