package util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class FileUtil {
    public static List<String> readLines(String path) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> res = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                res.add(line);
            }
        }
        return res;

    }
}
