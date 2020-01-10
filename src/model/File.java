package model;

import java.util.Date;

public class File extends FilesystemObject {

    private String content;

    public File(String name, Directory parent, Permissions permissions, Date creationDate, String content) {
        super(name, parent, permissions, creationDate);
        this.content = content;
    }

    public File(String name, Directory parent, Permissions permissions, Date creationDate) {
        super(name, parent, permissions, creationDate);
        this.content = "";
    }
}
