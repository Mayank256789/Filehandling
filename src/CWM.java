import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWM {
    public static void main(String[] args) {
        File myfile = new File("CWM_file.text");// for creating a file
        try{
            myfile.createNewFile();
            System.out.println("File is created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileWriter filewriter = new FileWriter("CWM_file.text");
            filewriter.write("Chatgpt is very important");
            filewriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
         try{
             Scanner sc = new Scanner(myfile);
             while(sc.hasNextLine()){
                 String line = sc.nextLine();
                 System.out.println(line);
             }
             sc.close();
         }catch(FileNotFoundException e){
             e.printStackTrace();
         }
     // delete is also implemented in same way






    }
}
