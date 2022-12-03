package filetesting;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        //accept input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter File name - ");
        String filename = scan.nextLine();

        createfile(filename);
    }

    //create file
    private static void createfile(String filename){
        try {
            File f = new File(filename);

            if (f.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
            writeFile(filename);
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }

    //Write data
    private static void writeFile(String filename){
        System.out.print("Do u want to write something in "+filename+"?\n1) y\n0) n\n-");
        try {
            Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(filename);
            BufferedWriter buffer = new BufferedWriter(writer);
            int yn = scanner.nextInt();
            if(yn == 1){
                System.out.print("Things to write(U can't copy/paste) - ");
                Scanner scanner1 = new Scanner(System.in);
                String text = scanner1.nextLine();
                buffer.write(text);
                buffer.close();
                System.out.println("Text added successfully");
            }else if(yn == 0){
                buffer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Aliquam etiam erat velit scelerisque in dictum non consectetur a. Faucibus in ornare quam viverra orci. Purus ut faucibus pulvinar elementum integer. Aliquam ut porttitor leo a. Elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi tristique. Adipiscing vitae proin sagittis nisl rhoncus. Ornare arcu odio ut sem nulla pharetra. Arcu dictum varius duis at consectetur lorem donec massa sapien. Diam phasellus vestibulum lorem sed risus ultricies tristique. Arcu ac tortor dignissim convallis aenean et tortor at. Duis at consectetur lorem donec massa sapien faucibus. Faucibus interdum posuere lorem ipsum dolor. Habitant morbi tristique senectus et netus et. Malesuada proin libero nunc consequat interdum varius sit. Arcu bibendum at varius vel. Dignissim sodales ut eu sem integer vitae justo. Vitae ultricies leo integer malesuada nunc vel risus commodo viverra. Amet mattis vulputate enim nulla aliquet porttitor. Sed vulputate mi sit amet.Sapien nec sagittis aliquam malesuada bibendum arcu. Blandit cursus risus at ultrices. Eget est lorem ipsum dolor. In nulla posuere sollicitudin aliquam ultrices sagittis. Purus viverra accumsan in nisl nisi scelerisque. Etiam dignissim diam quis enim. Nec sagittis aliquam malesuada bibendum arcu vitae elementum curabitur. Tortor id aliquet lectus proin nibh. Aenean pharetra magna ac placerat vestibulum. Feugiat nisl pretium fusce id velit ut tortor. Purus viverra accumsan in nisl. Massa eget egestas purus viverra. Elit ullamcorper dignissim cras tincidunt lobortis feugiat. Lorem ipsum dolor sit amet consectetur adipiscing elit duis. Ornare arcu odio ut sem nulla pharetra diam sit. Tristique nulla aliquet enim tortor at. Duis at tellus at urna condimentum mattis pellentesque. Ultrices gravida dictum fusce ut placerat orci nulla pellentesque. Eu mi bibendum neque egestas congue quisque egestas diam.Condimentum vitae sapien pellentesque habitant. Varius vel pharetra vel turpis nunc eget. In arcu cursus euismod quis viverra nibh. A scelerisque purus semper eget duis at tellus at urna. Libero justo laoreet sit amet cursus sit. Lectus urna duis convallis convallis tellus. Sodales neque sodales ut etiam sit amet nisl. Pretium lectus quam id leo in vitae turpis. Sit amet luctus venenatis lectus magna fringilla. Risus commodo viverra maecenas accumsan. Sagittis eu volutpat odio facilisis mauris.Leo vel fringilla est ullamcorper. Eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada bibendum. Adipiscing vitae proin sagittis nisl. Pellentesque habitant morbi tristique senectus et netus. Nisl vel pretium lectus quam id leo in. At risus viverra adipiscing at in. At in tellus integer feugiat scelerisque. Feugiat vivamus at augue eget arcu dictum varius duis at. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Non tellus orci ac auctor augue mauris augue. Sit amet nisl purus in mollis nunc sed. Ipsum a arcu cursus vitae congue mauris rhoncus aenean. At risus viverra adipiscing at in. Diam vel quam elementum pulvinar etiam. Tellus rutrum tellus pellentesque eu tincidunt tortor aliquam nulla facilisi. Dignissim suspendisse in est ante. Quis enim lobortis scelerisque fermentum dui. Vel pharetra vel turpis nunc eget. Sit amet cursus sit amet dictum sit amet. Turpis nunc eget lorem dolor sed.Enim tortor at auctor urna nunc id. Lectus sit amet est placerat in. Proin sagittis nisl rhoncus mattis rhoncus urna neque. Nunc pulvinar sapien et ligula ullamcorper. Pellentesque habitant morbi tristique senectus. Est pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat. Mi quis hendrerit dolor magna eget est. Facilisis sed odio morbi quis commodo odio. A arcu cursus vitae congue mauris. Id volutpat lacus laoreet non curabitur gravida arcu ac. Sit amet tellus cras adipiscing enim. Lobortis scelerisque fermentum dui faucibus in ornare quam viverra. Cursus turpis massa tincidunt dui ut ornare. Viverra adipiscing at in tellus. Curabitur gravida arcu ac tortor dignissim convallis. Nullam ac tortor vitae purus faucibus ornare suspendisse. Lectus sit amet est placerat in. Fermentum leo vel orci porta non pulvinar neque. Magna fermentum iaculis eu non diam phasellus vestibulum lorem.");
                buffer.close();
                System.out.println("Text added successfully");
            }
            findChar(filename);
        } catch (Exception e) {
            System.out.println("\nInvalid Input. Try only 0/1\n");
            writeFile(filename);
        }
        
    }

    //Find char
    private static void findChar(String filename) throws Exception{
        FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        int i,count = 0;
        while((i=br.read())!=-1){
            if((char)i == 'a'){
                count++;
            }
        }
        System.out.println("Number of e - " + count);
        br.close();
        fr.close();
    }
    
}
