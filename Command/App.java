public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // create devices : concrete receiver nasıl yapılacağını bilenler
        TV tv = new TV();
        Stereo stereo = new Stereo();
        // Concrete command ler nasıl yapılır bilmezler
        Command turnOnTv = new TurnOnCommand(tv);
        Command turnOffTv = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTvCommand = new ChangeChannelCommand(tv);
        // Invoker çağırıcı
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setComand(turnOnTv);
        remoteControl.pressButton();

        remoteControl.setComand(turnOffTv);
        remoteControl.pressButton();

        remoteControl.setComand(adjustVolumeStereoCommand);
        remoteControl.pressButton();

        remoteControl.setComand(changeChannelTvCommand);
        remoteControl.pressButton();
    }
}
