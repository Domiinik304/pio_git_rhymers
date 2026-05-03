package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int MAX_CAPACITY = 12;
    public static final int STACK_FULL_INDICATOR = MAX_CAPACITY - 1;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAULT_VALUE = -1;

    private int[] numbers = new int[MAX_CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == STACK_FULL_INDICATOR    ;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
