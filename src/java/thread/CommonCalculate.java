package java.thread;

public class CommonCalculate {

    private int amount;
    private int interest;

    public CommonCalculate() {
        this.amount = 0;
    }

    private Object interestLock = new Object();

    private Object amountLock = new Object();

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void plus(int value) {
        synchronized (amountLock) {
            this.amount += value;
        }
    }

    public void minus(int value) {
        synchronized (this) {
            this.amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }

}
