public class Main_end {
    public static void main(String[] args) {
        Android android = new Android();
        IPhone iPhone = new IPhone();
        LightningToUSBCAdapter_end lightningToUSBCAdapter = new LightningToUSBCAdapter(iPhone);

        chargePhone(android);
        chargePhone(lightningToUSBCAdapter);
    }

    static void chargePhone(USBCPhone phone) {
        phone.plugInUSBC();
        phone.charge();
    }
}
