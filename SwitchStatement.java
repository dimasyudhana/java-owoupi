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


        // switch-lambda sebagai opsi praktis up to java 14
        switch (nilai) {
            case "A" -> System.out.println("Wow mantab lulus bro");
            case "B", "C" -> System.out.println("yaa lumayan bro");
            case "D" -> System.out.println("coba lagi bro");
            default -> System.out.println("salah jurusan mungkin bro");
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow mantab lulus bro";
            case "B", "C" -> ucapan = "yaa lumayan bro";
            case "D" -> ucapan = "coba lagi bro";
            default -> ucapan = "salah jurusan mungkin bro";
        };

        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield "Wow mantab lulus bro";
            case "B", "C":
                yield "yaa lumayan bro";
            case "D":
                yield  "coba lagi bro";
            default :
                yield "salah jurusan mungkin bro";
        };

        System.out.println(ucapan);
    }
}
