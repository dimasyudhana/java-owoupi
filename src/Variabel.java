public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Peter Zalai";
        System.out.println(name);

        int number = 7;
        String address = "Indonesia";

        System.out.println(number);
        System.out.println(address);

        name = "Carlo Zapata";
        System.out.println(name);

        String firstName = "John";
        String middleName = "F";
        String lastName = "Khannedy";

        // kalau di Golang ini namanya const
        final String application = "Belajar Java";
        // atau bisa juga >> final var application = "Belajar Java";
        // Cannot assign a value to final variable 'application'
        // application = "Belajar Go";

        System.out.println(application);
    }
}
