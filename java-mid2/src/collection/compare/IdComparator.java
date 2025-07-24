package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {


    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getId().compareTo(o2.getId());
        //이때 사용된 compareTo는 이미 자바에서 만들어놓은 method이다. 문자열의 대소를 알아서 비교해준다.
    }
}
