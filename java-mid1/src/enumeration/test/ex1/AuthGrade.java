package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() { //static 언제 쓰는지 알아두자 왜 붙쓰는지도 모르구 있네
        return level;
    }

    public String getDescription() {
        return description;
    }
}
