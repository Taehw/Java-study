package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1); //그냥 set1이라고 해도 되는데 코드가독성때문인듯
        union.addAll(set2);

        Set<Integer> intersecion = new HashSet<>(set1); //그냥 set1이라고 해도 되는데 코드가독성때문인듯
        intersecion.retainAll(set2); //retain - 유지하다

        Set<Integer> diffrence = new HashSet<>(set1); //그냥 set1이라고 해도 되는데 코드가독성때문인듯
        diffrence.removeAll(set2);

        System.out.println("union = " + union);
        System.out.println("intersecion = " + intersecion);
        System.out.println("diffrence = " + diffrence);


    }


}
