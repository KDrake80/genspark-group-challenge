<<<<<<< Updated upstream:src/SortInput.java
=======
package Project;

import Project.Extract_Int_Value;
>>>>>>> Stashed changes:src/main/java/Project/SortInput.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortInput {
    public static ArrayList<String> sortInput() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        //read text file
        //for every line use function to get int val
        //Arraylist and text file are parallel
        //sort int array and string array together
<<<<<<< Updated upstream:src/SortInput.java
        BufferedReader br = new BufferedReader(new FileReader(".idea/TextInput"));
=======
        BufferedReader br = new BufferedReader(new FileReader("TextInput"));
>>>>>>> Stashed changes:src/main/java/Project/SortInput.java
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
            intList.add(Extract_Int_Value.extract_html(line));
        }

        int total = intList.get(0);
        for (int i = 1; i < intList.size(); i++) {
            total = total + intList.get(i);
            if (intList.get(i - 1) > intList.get(i)) {
                Collections.swap(intList, i - 1, i);
                Collections.swap(list, i - 1, i);
                for (int y = i-1 ; y > 0; y--)
                {
                    if (intList.get(y-1) > intList.get(y))
                    {
                        Collections.swap(intList , y-1,y);
                        Collections.swap(list , y-1,y);
                    }
                }
            }
        }
        return list;
    }
}