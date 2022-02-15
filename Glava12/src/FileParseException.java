public class FileParseException extends Exception {
    private int line;
    private String filename;

    public FileParseException(String msg, String filename, int line) {
        super(msg + "(line #" + line + ") (text = " + filename + ")");
        this.line = line;
        this.filename = filename;

    }
    public int getLine() {
        return line;
    }
    public String getFilename() {
        return filename;
    }

}
