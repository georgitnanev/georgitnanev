import java.io.File;

public class Zadacha3 {

    public static String createPath(String parent, String filename) {
        if(parent == null)
            throw new IllegalArgumentException("The parent path can't be null!");
        if (filename == null)
            throw new IllegalArgumentException("The filename can't be null!");
        return parent+File.separator + filename;
    }

    public static void main(String[] args) {
        System.out.println(Zadacha3.createPath("dir1 ", "file1"));
        System.out.println();
        System.out.println(Zadacha3.createPath(null, "file1"));
    } // Exception in thread "main"
     // We must check the call stack and trace locate the method that produced
    // the wrong argument



}
