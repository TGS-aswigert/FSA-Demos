public class Android implements USBCPhone {
    @Override
    public void charge() {
        System.out.println(this + " is charging.");
    }

    @Override
    public void plugInUSBC() {
        System.out.println(this + " plugged into USB Cable.");
    }
}
