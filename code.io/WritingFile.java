import java.io.File;
import java.io.FileWriter;
public class WritingFile {
    public static void main(String[] args) {
        try {
            File f = new File("Example1.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("Hello Olong, You are Trying to Learn Java");
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
