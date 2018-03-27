package behavioral.chain_of_responsibility.gof;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30)
        {
            System.out.println(String.format("%s handled request %d",this.getClass().getSimpleName().toString(), request));
        }
        else if (successor != null)
        {
            successor.handleRequest(request);
        }
    }
}
