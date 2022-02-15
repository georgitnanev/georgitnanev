import java.io.*;

public class Zadacha9 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Input and output files");
            System.exit(0);
        }
        String inputFile = args[0];
        String outputFile = args[1];

        try (
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            long fileSize = new File(inputFile).length();
            byte[] allBytes = new byte[(int) fileSize];

            int bytesRead = inputStream.read(allBytes);

            outputStream.write(allBytes, 0, bytesRead);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
