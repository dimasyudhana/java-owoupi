public class Block {
    public static void main(String[] args) {
        System.out.println("hello world 1");
        System.out.println("hello world 2");
        System.out.println("hello world 3");

        // block didalam block supaya rapi aja
        {
            System.out.println("hello world 4");
            System.out.println("hello world 5");
            System.out.println("hello world 6");
        }
    }
}

// hasilnya ya sama aja
// hello world 1
// hello world 2
// hello world 3
// hello world 4
// hello world 5
// hello world 6
