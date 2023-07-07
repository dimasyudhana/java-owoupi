public class Array {
    public static void main(String[] args) {
        // String[] arr;
        // arr = new String[3];
        String[] arr = new String[3];
        arr[0] = "John";
        arr[1] = "F";
        arr[2] = "Khennedy";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String[] namaNama = {
                "John", "F", "Khennedy"
        };

        int[] arrInt = new int[] {
                1,2,3,4,5,6,7,8,9
        };

        long[] arrLong = new long[]{
                10L,100L,1000L
        };

        arrLong[1] = 10000L;

        System.out.println(namaNama[1]);
        System.out.println(arrInt[1]);
        System.out.println(arrLong[1]);
        System.out.println(arrLong.length);

        String[][] members = {
                {"Peter","Zalai"},
                {"Carlo","Zapata"},
                {"John","Boast"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}

// John
// F
// Khennedy
// F
// 2
// 10000
// 3
// Zalai
// Carlo
