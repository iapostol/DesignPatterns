package behavioral.chainofresponsibility.gof;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10)
        {
            System.out.println(String.format("%s handled request %d",this.getClass().getSimpleName().toString(), request));
        }
        else if (successor != null)
        {
            successor.handleRequest(request);
        }
    }
}
