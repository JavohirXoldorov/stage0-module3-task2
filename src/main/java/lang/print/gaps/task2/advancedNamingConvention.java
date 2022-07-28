package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int adult_age = 18;

    private int AGE;
    private int phoneNumber;

    void CallToFriend() {
        callByNumber(phoneNumber);
    }

    void callByNumber(int Number) {
        System.out.println(Number);
    }
}
