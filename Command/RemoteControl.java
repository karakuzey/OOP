public class RemoteControl {
    private Command command;

    public void setComand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();

    }
}
