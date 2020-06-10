import java.io.*;
import java.util.*;
public class SimpleDirList {
    public static void main(String[] args) {
        File path = new File(".");   // Current directory
        String[] list = path.list(); // Get the listing
        // Output the listing
        Arrays.sort(list);
        for (int i = 0; i < list.length; ++i) {
            System.out.println(list[i]);
        }
    }
}
