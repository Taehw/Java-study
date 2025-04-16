package array;

public class ArrayDi4 {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int columm = 0; columm < arr[row].length; columm++) {
                arr[row][columm] = i++; //증감연산자를 한줄에 작성해줄수도 있다
                //i++;
            }
        }


        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
