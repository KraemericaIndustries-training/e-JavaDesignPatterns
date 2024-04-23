package tjdpc;

public class ClientCommand {
    public static void main(String[] args) {

        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();  // creating the receiver

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);  // create the command with the associating receiver

        FileInvoker file = new FileInvoker(openFileCommand);  // creating invoker and associate it with the command


        file.execute();  // perform action on invoker object

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}