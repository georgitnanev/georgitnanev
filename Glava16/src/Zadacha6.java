import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class Zadacha6 {
    public static void printFiles(String hardDisc) {
        Queue<File> q = new LinkedList<>();
        q.add(new File(hardDisc));
        while (!q.isEmpty()) {
            File current = q.poll();
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

