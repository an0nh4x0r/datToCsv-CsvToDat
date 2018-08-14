import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatToCsv {

    private static final String DELIMITER = "|";
    private static final String INPUT_FILE = "src/SomeDatFile.dat";

    public static void main(String[] args) {
        String line = null;

        try {
            FileReader fileReader = new FileReader(INPUT_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
