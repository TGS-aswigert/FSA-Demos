package java_end;

public class Main {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();
        IntService serviceC = new ServiceC();
        Client client = new Client();
        System.out.println(client.doSomething(serviceB));
        System.out.println(client.doSomethingElse(serviceC));
    }
}
