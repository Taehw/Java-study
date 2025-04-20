package construct;

public class MemberThis {

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //자동으로 this가 붙는다. 우리눈엔 안보인다.
    }
}
