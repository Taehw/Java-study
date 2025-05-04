package nested.nested.ex2;

public class Network {

    public void sendMessgae(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    //Network 클래스안에 정적 중첩 클래스 생성
    //외부에서는 private로 감쌋기 때문에 씬경 쓸일 없음.
    //다른 개발자가 private 보고 아 Network 내부에서 단독으로 쓰는 거구나라고 생각하게 된
    private static class NetworkMessage { //그냥 메시를 받아서 출력만 하는 기능

        private String message;

        public NetworkMessage(String message) {
            this.message = message;
        }

        public void print() {
            System.out.println(message);
        }
    }
}
