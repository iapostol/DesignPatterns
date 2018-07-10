package behavioral.chainofresponsibility.approver;

public class Purchase {
    public Purchase(int number, double amount, String purpose) {
        this.number = number;
        this.amount = amount;
        this.purpose = purpose;
    }

    private int number;
    private double amount;
    private String purpose;

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }


    public String getPurpose() {
        return purpose;
    }
}
