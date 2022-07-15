
package Project;

import Project.Extract_Int_Value;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class SortInput {
    public static ArrayList<String> sortInput(String path) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();


        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;


        //POPULATE DATA SETS
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        list.parallelStream().forEach(
                (l) -> {
                    try {
                        intList.add(Extract_Int_Value.extract_html(l));
                        output.add(l);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        //SORT DATA
        int total = intList.get(0);
        for (int i = 1; i < intList.size(); i++) {
            total = total + intList.get(i);
            if (intList.get(i - 1) > intList.get(i)) {
                Collections.swap(intList, i - 1, i);
                Collections.swap(output, i - 1, i);
                for (int y = i - 1; y > 0; y--) {
                    if (intList.get(y - 1) > intList.get(y)) {
                        Collections.swap(intList, y - 1, y);
                        Collections.swap(output, y - 1, y);
                    }
                }
            }
        }

        return list;
    }


    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        sortInput("TextInput");
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration);
    }


}