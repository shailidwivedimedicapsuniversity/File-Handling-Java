import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle{
    public static void main(String args[]) throws IOException{
        // FileReader and Filewriter
        System.out.println("file handling in java");
        
        File f = new File("abc.txt");
        // reading a file using scanner class
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);            
        }
        sc.close();
    
        //create a new file but can't read or write this file f
        f.createNewFile();
        System.out.println(f.exists());

        // for read file using filereader, Reading from file 
        FileReader fr = new  FileReader("a.txt") ;
        System.out.println(fr.read());

        // for write in file use filewriter, Writing to file
        FileWriter fw = new FileWriter("xyz.txt");
        fw.write("hii, I am shaili , how are you \nok byee ");
        fw.close();
     
        // delete a file
        if(f.delete()){
            System.out.println("file deleted sucessfully "+ f.getName());
        }else{
            System.out.println("file not deleted ");
        }

     
    }
}