# Files System


### To run:

```
$ java -jar path_of_the_jar_file
```

### Examples of commands:

##### Change directory:
(user has to have read permissions)
```
$ cd 
$ cd .
$ cd ..
$ cd /home/folder1/folder2
$ cd folder1
```

##### View directory's content:

```
$ ls
$ ls folder1
```

##### Make directory:

```
$ mkdir name
$ mkdir /home/folder1/name
```

##### Create new file (with and without text) or edit an existing file:
(date will be updated when you edit it, user has to have write permissions)
```
$ touch filename
$ touch filename "content"
```

##### View file's content: 
(user has to have read permissions)
```
$ cat filename
```

##### View file or directory's date:

```
$ date filename
$ datedir name
```

##### Remove files:
(user has to have write permissions)
```
$ rm filename
```

##### Remove directories:
(user has to have write permissions)
```
$ rmd name
```

##### Copy a directory (and its subdirectories) to another directory or
##### Copy a file to another directory:
(new directory will have the current date/time of creation)
```
$ cp /home/other /home/smth		
$ cp /home/other/file.txt /home/smth
```

##### Move one directory (and its subdirectories) to another directory or
##### Move a file to another directory:

```
$ mv /home/other /home/smth
$ mv /home/other/file.txt /home/smth
```

> All new directories and files are created with permissions to be accessed by all users.
However, the directory 'tmp' and the file 'file_admin.txt' only have owner permissions, since they were created by the user 'admin', you can only check them (cat, touch) if you login with that user.