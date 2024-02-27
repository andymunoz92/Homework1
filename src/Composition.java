import java.util.ArrayList;
import java.util.List;
/*
class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    // Accessors
    public String getName(){
        return name;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("File: " + name);
    }
}*/

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    // Accessors
    public String getName(){
        return name;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "File{" + "name='" + name + '\'' + '}';
    }
}

/*
class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    // Accessors
    public String getName() {
        return name;
    }
    public List<File> getFiles() {
        // Return a copy to prevent external modifications
        return new ArrayList<>(files);
    }
    public List<Folder> getSubFolders() {
        // Return a copy to prevent external modifications
        return new ArrayList<>(subFolders);
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setFiles(List<File> files) {
        this.files = new ArrayList<>(files); // Create a copy to prevent external modifications
    }
    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = new ArrayList<>(subFolders); // Create a copy to prevent external modifications
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void removeSubFolder(Folder folder) {
        subFolders.remove(folder);
    }

    public void print() {
        System.out.println("Folder: " + name);
        for (File file : files) {
            file.print();
        }
        for (Folder subFolder : subFolders) {
            subFolder.print();
        }
    }
}*/

class Folder{
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subfolders;

    public Folder(){
        this.subfolders = new ArrayList<Folder>();
        this.files = new ArrayList<File>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void removeSubfolder(String subfolderName){
        for (Folder subfolder : subfolders){
            if (subfolderName == subfolder.getName()){
                this.subfolders.remove(subfolder);
                break;
            }
        }
    }

    public void addSubfolder(String subfolderName){
        Folder subfolder = new Folder();
        subfolder.setName(subfolderName);
        subfolders.add(subfolder);
    }

    public Folder getSubfolder(String subfolderName){
        for (Folder subfolder : subfolders){
            if(subfolderName == subfolder.getName())
                return subfolder;
        }
            return new Folder();
    }

    public boolean removeFile(File file){
        return this.files.remove(file);
    }

    public void addFile(String fileName){
        File file = new File(fileName);
        files.add(file);
    }

    public String toString(){
        return "Folder{name='" + name + '\'' + ",subfolders=" + subfolders.toString() +
                ", files=" + files.toString() + "}" ;
    }

    public void printFolderContents(){
        System.out.println(this.toString());
    }
}

public class Composition {
    public static void main(String[] args) {
        /*
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");

        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");

        Folder publicFolder = new Folder("public");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File indexhtml = new File("index.html");

        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        publicFolder.addFile(htaccess);
        publicFolder.addFile(htrouter);
        publicFolder.addFile(indexhtml);

        System.out.println("Initial structure:");
        phpDemo1.print();

        //publicFolder.removeFile(indexhtml);

        System.out.println("\nAfter deleting 'app' folder:");
        sourceFiles.removeSubFolder(app);
        phpDemo1.print();

        System.out.println("\nAfter deleting 'public' folder:");
        sourceFiles.removeSubFolder(publicFolder);
        phpDemo1.print();
         */

        Folder phpDemo1 = new Folder();

        phpDemo1.setName("php_demo1");
        phpDemo1.addSubfolder("Source Files");
        phpDemo1.addSubfolder("Include Path");
        phpDemo1.addSubfolder("Remove Files");

        //Folder = "Source Files"
        phpDemo1.getSubfolder("Source Files").addSubfolder(".phalcon");
        phpDemo1.getSubfolder("Source Files").addSubfolder("app");
        phpDemo1.getSubfolder("Source Files").addSubfolder("cache");
        phpDemo1.getSubfolder("Source Files").addSubfolder("public");

        //Folder = "app"
        phpDemo1.getSubfolder("Source Files").getSubfolder("app").addSubfolder("config");
        phpDemo1.getSubfolder("Source Files").getSubfolder("app").addSubfolder("controllers");
        phpDemo1.getSubfolder("Source Files").getSubfolder("app").addSubfolder("library");
        phpDemo1.getSubfolder("Source Files").getSubfolder("app").addSubfolder("migration");
        phpDemo1.getSubfolder("Source Files").getSubfolder("app").addSubfolder("models");
        phpDemo1.getSubfolder("Source Files").getSubfolder("app").addSubfolder("views");

        //Folder = "public"
        phpDemo1.getSubfolder("Source Files").getSubfolder("public").addFile(".htaccess");
        phpDemo1.getSubfolder("Source Files").getSubfolder("public").addFile(".htrouter.php");
        phpDemo1.getSubfolder("Source Files").getSubfolder("public").addFile("index.html");

        System.out.println("Complete File System");
        phpDemo1.printFolderContents();

        System.out.println("After app Folder removal");
        phpDemo1.getSubfolder("Source Files").removeSubfolder("app");
        phpDemo1.printFolderContents();

        System.out.println("After app Folder removal");
        phpDemo1.getSubfolder("Source Files").removeSubfolder("app");
        phpDemo1.printFolderContents();
    }
}
