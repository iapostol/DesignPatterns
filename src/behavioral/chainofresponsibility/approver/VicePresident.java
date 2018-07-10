package behavioral.chainofresponsibility.approver;

public class VicePresident extends Approver {
    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < 25000.0)
        {
            System.out.println(String.format("%s approved request# %d",  this.getClass().getSimpleName(), purchase.getNumber()));
            return;
        }

        if (successor != null)
            successor.processRequest(purchase);
    }
}
