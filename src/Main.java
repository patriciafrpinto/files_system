import model.*;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = "";

        // primeiro criar alguma info para já existir

        User admin = new User("admin");     // currently in home TALVEZ P REMOVER DPS

        Directory home = new Directory("home", new Directory(), new Permissions(), new Date());
        Filesystem system = new Filesystem(admin,home,home,home);

        Directory docs = new Directory("documents", home, new Permissions(), new Date());
        Directory folder1 = new Directory("folder", home, new Permissions(), new Date());
        Directory folder2 = new Directory("folder2", home, new Permissions(), new Date());

        // pedir login
        System.out.println("$: Username: ");
        String name = reader.readLine();
        User user = new User(name);
        system.setLoggedInUser(user);       // agora deu login no sistema outra pessoa

        boolean error = false;

        // ler info constantemente num loop
        while(read != "exit") {

            System.out.println("$: ");
            String input = reader.readLine();

            String[] arrayInput = input.split(" ");

            if (arrayInput.length > 3){
                System.out.println("Too many arguments");
            return;
            }

            String command = arrayInput[0];     // FALTA DAR TRIM
            String path = "";

            if(arrayInput.length >= 2) path = arrayInput[1];

            /**          ***************************       **/
            if(command.equals("cd")){                 //cd .. ou cd /home/pasta1/pasta2 ou cd

                if(arrayInput.length == 1) {
                    system.cd();            // cd
                }
                else{
                    system.cd(path);        // cd /home/documents
                }
            }
            else if(command.equals("ls")){
                if(arrayInput.length == 1) system.ls();         // ls

                else error = system.ls(path);                                // ls /home/pasta1
            }
            else if(command.equals("mkdir")){         // mkdir nomedirectory ou mkdir /home/nome
                error = system.mkdir(path);
            }
            else if(command.equals("touch")){         // touch nomefile

            }
            else if(command.equals("cp")){            // cp source destination

            }
            else if(command.equals("mv")){            //

            }
            else if(command.equals("rm")){

            }
            else{
                error = true;       // nem era um comando válido..
            }

            if(error) System.out.println("Caminho errado");
        }


    }
}

