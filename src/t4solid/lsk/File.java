package t4solid.lsk;

/**
 * Created by joseba on 25/10/16.
 */
public abstract class File {
    public String filePath;
    public File(String filePath){this.filePath = filePath; }

    public void loadFile(){
        System.out.println("file loaded from "+filePath);
    }

}
