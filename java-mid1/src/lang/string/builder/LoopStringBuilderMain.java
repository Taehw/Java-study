package lang.string.builder;


//String 최적화가 어려운 경우 - 문자열을 루프안에서 문자열을 더하는 경우 최적화가 이루어지지 않음
public class LoopStringBuilderMain {

    public static void main(String[] args) {

        long StartTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        String result = sb.toString();
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - StartTime) + "ms");
    }
}
