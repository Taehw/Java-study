package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random= new Random();
    private int[] lottoNumbers;
    private int count;

    //로또 번호 생성
    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            //1부터 45까지 생성
            int number = random.nextInt(45)+1;
            //중복되지 않는 경우메만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }

}
