package java_end;

public class Client {

    public String doSomething(Service service) {
        return service.getInfo();
    }

    public int doSomethingElse(IntService service) {
        return service.getInfo();
    }

}
