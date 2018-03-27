package behavioral.chain_of_responsibility.gof;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20)
        {
            System.out.println(String.format("%s handled request %d",this.getClass().getSimpleName().toString(), request));
        }
        else if (successor != null)
        {
            successor.handleRequest(request);
        }
    }
}
