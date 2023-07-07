public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Peter", "Zalai",
                "Carlo", "Zapata",
                "Richard", "Barker",
        };

        for (var i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        System.out.println("===");

        for (String value : names) {
            System.out.println(value);
        }
    }
}
