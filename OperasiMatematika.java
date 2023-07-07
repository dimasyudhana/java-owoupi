public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        System.out.println("=====");

        // augmented assingment (operasi ke dirinya sendiri)
        int c = 100;

        // ini operasinya sequential
        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);
        c /= 10;
        System.out.println(c);
        c %= 10;
        System.out.println(c);

        System.out.println("=====");

        // unary operation
        int d = 100;

        d++;
        System.out.println(d);
        d--;
        System.out.println(d);
    }
}

// 110
// 90
// 1000
// 10
// 0
// =====
// 110
// 100
// 1000
// 100
// 0
// =====
// 101
// 100

