public class LightningToUSBCAdapter_end implements USBCPhone{
    private final IPhone phone;

    public LightningToUSBCAdapter_end(IPhone phone) {
        this.phone = phone;
    }

    @Override
    public void charge() {
        System.out.println(phone + " is charging.");
    }

    @Override
    public void plugInUSBC() {
        System.out.println(this + " plugged into USB Cable.");
        System.out.println(this + " plugged into " + phone);
    }
}
