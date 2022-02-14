import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    static List<Integer>  readIntsFromTxtFile (String fileName) throws IOException, Zadacha10 {
        var reader = new BufferedReader(new FileReader(fileName));
        List<Integer> ints = new ArrayList<Integer>();
        int lineNumber = 0;
        String line = "";

        try {

            while ((line = reader.readLine()) != null)
                if (line.length() > 0)
                    ints.add(Integer.parseInt(line));
            lineNumber++;
        } catch (Exception ex) {
            throw new Zadacha10("Wrong file" + fileName, lineNumber, line);

        } finally {
            reader.close();

        }
        return ints;

    }
}
