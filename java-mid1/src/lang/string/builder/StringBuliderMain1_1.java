package lang.string.builder;

public class StringBuliderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb); //ABCD

        sb.insert(4, "java");
        System.out.println("insert = " + sb); //ABCDjava

        sb.delete(4, 8);
        System.out.println("delete = " + sb); //ABCD

        sb.reverse();
        System.out.println("reverse = " + sb); //DCBA

        //StringBulider -> String
        String string = sb.toString(); //side effect를 배제 할수 잇음 가변 -> 불변으로 전환
        System.out.println("string = " + string);
    }
}
