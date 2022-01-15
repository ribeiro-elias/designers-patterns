package me.command;

public class Client {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("Open txt")));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("Save txt")));

        //Lambda
        textFileOperationExecutor.executeOperation(() -> "Opening file file.txt");
        textFileOperationExecutor.executeOperation(() -> "Saving file file.txt");

        //Method references
        TextFile textFile = new TextFile("file1.txt");
        textFileOperationExecutor.executeOperation(textFile::open);
        textFileOperationExecutor.executeOperation(textFile::save);
    }
}
