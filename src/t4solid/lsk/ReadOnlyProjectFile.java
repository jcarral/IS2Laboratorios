package t4solid.lsk;

public class ReadOnlyProjectFile extends File {

    public ReadOnlyProjectFile(String filePath) {
        super(filePath);
        // TODO Auto-generated constructor stub
    }

    public void saveFile() {
        System.out.println("ERROR, can not be Saved");
    }
}
