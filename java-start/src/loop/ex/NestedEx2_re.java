package loop.ex;

public class NestedEx2_re {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
