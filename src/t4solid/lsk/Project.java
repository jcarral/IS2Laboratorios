package t4solid.lsk;

import java.util.Vector;

/**
 * Created by joseba on 18/10/16.
 */

public class Project {

    public Vector<File> files=new Vector<File>();
    public void addProject(File p){
        files.add(p);
    }
    public void loadAllFiles(){
        for (File f:files)
            f.loadFile();
    }
    public void saveAllFiles(){
        for (File f:files)
            if(f instanceof FileSaveable)
                ((FileSaveable) f).saveFile();
    }
}
