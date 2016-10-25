package t4solid.lsk;

/**
 * Created by joseba on 18/10/16.
 */
public class ProjectFile {
    public String filePath;
    public ProjectFile(String filePath){
        this.filePath=filePath;
    }
    public void loadFile(){
        System.out.println("file loaded from "+filePath);
    }
    public void saveFile(){
        System.out.println("file saved to "+filePath);
    }
}
