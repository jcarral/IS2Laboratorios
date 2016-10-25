package t4solid.lsk;

/**
 * Created by joseba on 25/10/16.
 */
public class MainLSK {
    public static void main(String[] args){

        Project proyecto = new Project();
        proyecto.addProject(new ProjectFile("/path/to/my/fileOne.txt"));
        proyecto.addProject(new ProjectFile("/path/to/my/fileTwo.png"));
        proyecto.addProject(new ProjectFile("/path/to/my/fileThree.psd"));
        proyecto.addProject(new ReadOnlyProjectFile("/path/to/my/fileFour.ai")); //Error al salvar

        proyecto.loadAllFiles();
        proyecto.saveAllFiles();
    }
}
