import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    static List<Integer>  readIntsFromTextFile (String filename) throws IOException, FileParseException {
        var reader = new BufferedReader(new FileReader(filename));
        List<Integer> ints = new ArrayList<Integer>();
        int line = 1;
        String fileName = "";

        try {

            while ((filename = reader.readLine()) != null)
                if (filename.length() > 0)
                    ints.add(Integer.parseInt(filename));
            line++;
        } catch (Exception ex) {
            throw new FileParseException ("Wrong file" + filename, fileName, line);

        } finally {
            reader.close();

        }
        return ints;

    }
}
