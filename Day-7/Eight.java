import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Eight {
    public static void main(String[] args) throws IOException{
        readFile("demo.txt");
    }

    private static void readFile(String file) throws IOException {
        try(BufferedReader reader= new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
