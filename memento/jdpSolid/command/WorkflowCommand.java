package jdpSolid.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}