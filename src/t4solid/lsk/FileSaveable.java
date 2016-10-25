package t4solid.lsk;

/**
 * Created by joseba on 25/10/16.
 */
public abstract class FileSaveable extends File {
    public FileSaveable(String filePath) {
        super(filePath);
    }

    public void saveFile(){
        System.out.println("file saved to "+filePath);
    }

}
