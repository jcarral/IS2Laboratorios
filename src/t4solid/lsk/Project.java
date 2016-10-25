package t4solid.lsk;

import java.util.Vector;

/**
 * Created by joseba on 18/10/16.
 */

public class Project {

    public Vector<ProjectFile> files=new Vector<ProjectFile>();
    public void addProject(ProjectFile p){
        files.add(p);
    }
    public void loadAllFiles(){
        for (ProjectFile f:files)
            f.loadFile();
    }
    public void saveAllFiles(){
        for (ProjectFile f:files)
            f.saveFile();
    }
}
