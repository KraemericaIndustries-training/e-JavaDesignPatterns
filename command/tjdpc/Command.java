package tjdpc;

interface Command {
    void execute();
    // could add an undo or redo commands
}

class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    // (optional) store previous state for undo, String someState
    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        // (optional) save previous state, in case undo called  someState = …….;
        this.fileSystem.openFile();
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}