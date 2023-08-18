public class Break {
    public static void main(String[] args) {
        int counter = 1;
        while(true){
            System.out.println("Perulangan ke - " + counter);
            counter++;
            if (counter > 10){
                break; // jika ingin menghentikan perulangan secara total.
            }
        }
        System.out.println("Perulangan berhenti");
    }
}
