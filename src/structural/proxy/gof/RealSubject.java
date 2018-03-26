package structural.proxy.gof;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Called RealSubject.request()");
    }
}
