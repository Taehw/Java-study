package loop.ex;

public class WhileEx3_re {

    public static void main(String[] args) {

        int sum = 0;
        int count = 1;
        int max = 100;

        while (count <= max) {

            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
