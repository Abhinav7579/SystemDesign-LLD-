
public class FileSystemApp {
    public static void main(String[] args) {
        FileSystemComponents file1=new File("file1.txt");
        FileSystemComponents file2=new File("file2.txt");

        Folder folder=new Folder("document");

        folder.addComponent(file1);
        folder.addComponent(file2);

    Folder subfolder=new Folder("subfolder");
    FileSystemComponents file3=new File("file3.txt");
    subfolder.addComponent(file3);
    folder.addComponent(subfolder);

    folder.showDetails();






    }
    
}
