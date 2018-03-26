package structural.proxy.gof;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public void request() {

        System.out.println("Proxy request");

        // Use 'lazy initialization'
        if (realSubject == null)
        {
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}
