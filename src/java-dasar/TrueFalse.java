public class TrueFalse {
    public static void main(String[] args) {
        String[] inputs = {"xoxoxo", "ooxxoo", "oxo"};
        for (String str: inputs) {
            int x = 0;
            int o = 0;
            for (char ch : str.toCharArray()) {
                if (ch == 'x')
                    x++;
                else if (ch == 'o')
                    o++;
            }
            if (x == o) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
