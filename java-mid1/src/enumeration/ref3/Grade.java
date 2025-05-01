package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int disoucntpercent;

    Grade (int discountpercent) {
        this.disoucntpercent = discountpercent;
    }

    public int getDisoucntPercent() {
        return disoucntpercent;
    }

    //추가
    public int discount(int price) {
        return price * disoucntpercent / 100;
    }
}
