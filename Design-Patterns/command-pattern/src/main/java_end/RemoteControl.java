public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command previousCommand;

    public RemoteControl() {
        this.onCommands = new Command[3];
        this.offCommands = new Command[3];

        Command noCommand = new NoCommand();

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        this.previousCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.previousCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.previousCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        this.previousCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Controller -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName())
                    .append("     ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuffer.append("[undo] ").append(this.previousCommand.getClass().getName()).append(" \n");
        return stringBuffer.toString();
    }
}
