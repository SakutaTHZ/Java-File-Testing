package filetesting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleWebProjectMaker {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Project Name - ");
            String name = scan.nextLine();

            //create files
            creatFile(name);
            
            System.out.println(name);
        }
    }

    private static void creatFile(String name) throws IOException {
        try {
            File f = new File(name);

            if (f.mkdir()){
                System.out.println("File created");

                try {
                    File imageFile = new File(name+"\\image");
                    imageFile.mkdir();
                    FileWriter myWriter = new FileWriter(name+"\\index.html");
                    myWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<title>\n"+name+"\n</title>\n<link rel=\"stylesheet\" href=\"style.css\">\n<script src=\"main.js\"></script>\n</head>\n<body>\n</body>\n</html>");
                    FileWriter myWriter1 = new FileWriter(name+"\\style.css");
                    myWriter1.write("*{\n\tmargin: 0;\n\tpadding: 0;\n\tfont-family: 'Roboto Mono', monospace;\nbox-sizing:border-box;\n}\n:root{\n\t--mainColor: #1d1e22;\n\t--secondaryColor: #393f4d;\n}");
                    FileWriter myWriter2 = new FileWriter(name+"\\main.js");
                    myWriter2.write("//Your code here");
                    myWriter.close();
                    myWriter1.close();
                    myWriter2.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }else{
                System.out.println("File already exists");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
