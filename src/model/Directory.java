package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory extends FilesystemObject {

    private List<Directory> childrenDirectories;
    private List<File> childrenFiles;

  /*  //dataEmissao = dataEmissao.trim(); //corta espacos inuteis
        if (name.isEmpty()) {
        throw new IllegalArgumentException();
    }
*/

    public Directory(String name, Directory parent, Permissions permissions, Date creationDate) {
        super(name, parent, permissions, creationDate);
        this.childrenDirectories = childrenDirectories;
        this.childrenFiles = childrenFiles;
        // como recebemos o pai e sabemos que o parent é pai deste directório, vamos acrescenter este dir aos filhos do pai
        parent.getChildrenDirectories().add(this);
    }

    public Directory() {
        super();
    }

    public List<Directory> getChildrenDirectories() {
        return childrenDirectories;
    }

    public void setChildrenDirectories(List<Directory> childrenDirectories) {
        this.childrenDirectories = childrenDirectories;
    }

    public List<File> getChildrenFiles() {
        return childrenFiles;
    }

    public void setChildrenFiles(List<File> childrenFiles) {
        this.childrenFiles = childrenFiles;
    }



    public Directory getChildDirectoryByName(String name){
        for(Directory obj : this.getChildrenDirectories()){
            if(obj.getName().equals(name)) {
                return obj;
            }
        }
        return null;
    }
}
