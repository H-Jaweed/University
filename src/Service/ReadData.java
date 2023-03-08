package Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static List<String> readDataFromFile(String path) {
        FileReader reader = null;
        String dataLine = "";
        List<String> list = new ArrayList<>();
        try {
            reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((dataLine = bufferedReader.readLine()) != null) {
                list.add(dataLine.replace(',', ' '));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Runtime error");
        }
        return list;
    }
}
