package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int i = 0;
        int max = 10;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
