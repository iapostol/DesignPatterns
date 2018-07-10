package behavioral.chainofresponsibility.approver;

public class President extends Approver {
    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < 100000.0)
            System.out.println(String.format("%s approved request# %d",  this.getClass().getSimpleName(), purchase.getNumber()));
        else
            System.out.println(String.format("Request# %d requires an executive meeting!",  purchase.getNumber()));
    }
}
