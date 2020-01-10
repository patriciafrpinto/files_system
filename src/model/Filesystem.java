package model;

public class Filesystem {

    private User loggedInUser;
    private Directory cwd;
    private Directory root;
    private Directory parent;

    public Filesystem(User loggedInUser, Directory cwd, Directory root, Directory parent) {
        this.loggedInUser = loggedInUser;
        this.cwd = cwd;
        this.root = root;
        this.parent = parent;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public Directory getCwd() {
        return cwd;
    }

    public void setCwd(Directory cwd) {
        this.cwd = cwd;
    }

    public Directory getRoot() {
        return root;
    }

    public void setRoot(Directory root) {
        this.root = root;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public void cd(){
        this.cwd = this.root;       // vai para o home
    }

    public boolean cd(String path){
        String[] array = path.split("/");       // ex[home,documents]


        if(array[0].equals("..")){          // para c ..
            this.cwd = this.parent;
        }

        Directory temp = this.cwd;      // FAZER CONSTRUCTOR CÓPIA

        for(String actual : array){
            if(temp.getChildDirectoryByName(actual) == null){
                return false;       // um dos nomes no path não faz sentido / não existe esse dir
            }
        }

        this.cwd = temp;    // current directory do user agora é este porque ele fez cd correctamente
        return true;
    }

    public void ls(){

        for(Directory d : this.cwd.getChildrenDirectories()){
            System.out.printf(d.getName());
        }

        for(File f : this.cwd.getChildrenFiles()){
            System.out.printf(f.getName());
        }
    }

    public boolean ls(String path){

        String[] array = path.split("/");       // ex[home,documents]
        Directory temp = this.cwd;      // FAZER CONSTRUCTOR CÓPIA

        for(String actual : array){
            if(temp.getChildDirectoryByName(actual) == null){
                return false;       // um dos nomes no path não faz sentido / não existe esse dir
            }
        }

        // imprimir os dirs e files que estão no directório encontrado temp
        for(Directory d : temp.getChildrenDirectories()){
            System.out.printf(d.getName());
        }

        for(File f : temp.getChildrenFiles()){
            System.out.printf(f.getName());
        }

        return true;
    }

    public boolean mkdir(String path){

        String[] array = path.split("/");       // ex[home,documents]
        Directory temp = this.cwd;      // FAZER CONSTRUCTOR CÓPIA

        for(String actual : array){
            if(temp.getChildDirectoryByName(actual) == null){
                return false;       // um dos nomes no path não faz sentido / não existe esse dir
            }
        }

        // imprimir os dirs e files que estão no directório encontrado temp
        for(Directory d : temp.getChildrenDirectories()){
            System.out.printf(d.getName());
        }

        for(File f : temp.getChildrenFiles()){
            System.out.printf(f.getName());
        }

        return true;
    }


}
