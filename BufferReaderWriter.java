import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
  
        // BufferedReader and BufferedWriter 
        FileWriter fw = new FileWriter("shaili.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hii, I am shaili , how are you ");
        fw.close();

        FileReader fr = new  FileReader("a.txt") ;
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}
