import java.io.File;
import java.util.Stack;

public class Zadacha7 {
    public static void printFiles(String hardDisc) {
        Stack<File> q = new Stack<>();
        q.add(new File(hardDisc));
        while (!q.isEmpty()) {
            File current = q.peek();
            File[] fileList = current.listFiles();
            if(fileList != null) {
                for(File file : fileList) {
                    if(file.isDirectory())
                        q.add(file);
                    else
                        System.out.println(file);
                }
            }
        }
    }
    public static void main(String[] args) {
        String hardDisc = "C:\\";
        printFiles(hardDisc);
    }
}


