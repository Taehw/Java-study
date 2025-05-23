package method.ex;
public class MethodEx3Ref_me {
    public static void main(String[] args) {
        int balance = 10000;
        // 입금 1000
        //int depositAmount = 1000;
        balance = deposit(balance, 1000); //좋은 코드 만들기
        // 출금 2000
        //int withdrawAmount = 2000;
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount){

        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount){

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니 다.");
        }

        return balance;
    }
}