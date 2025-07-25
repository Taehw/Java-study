package loop;

public class While2_3_re {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            sum += i;
            System.out.println("i= " + i + " sum= " + sum);
            i++;
        }
    }
}
