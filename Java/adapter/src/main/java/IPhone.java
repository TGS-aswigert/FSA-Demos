public class IPhone implements LightningPhone{
    @Override
    public void plugInLightningCable() {
        System.out.println(this + " plugged into lightning cable.");
    }

    @Override
    public void charge() {
        System.out.println(this + " is charging.");
    }
}
