package in.swapnilsingh.processors;

import java.io.*;

public class DatToCsvProcessor {

    private static final String DELIMITER = "\\|";
    private static final String INPUT_FILE = "src/SomeDatFile.dat";
    private static final String OUTPUT_FILE = "src/GeneratedExcelFile.csv";

    public static void main(String[] args) {
        String line = null;

        try {
            FileReader fileReader = new FileReader(INPUT_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            PrintWriter pw = new PrintWriter(new File(OUTPUT_FILE));
            StringBuilder sb = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                for (int i = 0; i < tokens.length; ++i) {
                    if (i != tokens.length - 1) {
                        sb.append(tokens[i] + ",");
                    }
                    else {
                        sb.append(tokens[i] + "\n");
                    }
                }
            }

            pw.write(sb.toString());

            bufferedReader.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
