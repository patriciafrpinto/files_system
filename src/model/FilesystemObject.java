package model;

import java.util.Date;

public class FilesystemObject {

    private String name;
    private String path;
    private Permissions permissions;
    private Date creationDate;
    private Directory parent;

    public FilesystemObject(String name, Directory parent, Permissions permissions, Date creationDate) {
        this.name = name;
        this.path = "/" + parent.getPath() + name;
        this.permissions = permissions;     // change
        this.creationDate = creationDate;       // change
    }

    public FilesystemObject() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
