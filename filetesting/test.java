package filetesting;
import java.io.*;
public class test {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to AI.");
        buffer.close();
        System.out.println("Success");
    }
}
