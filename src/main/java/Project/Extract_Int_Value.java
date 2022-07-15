package Project;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Extract_Int_Value {


    public static int extract_html(String numerical_word) throws IOException {
        //SET UP CONNECTION
        String USER_AGENT_ID = "Java/" + System.getProperty("java.version");
        URL url = new URL("https://coolconversion.com/math/words-to-numbers-converter/_" + numerical_word + "_in-numbers");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", USER_AGENT_ID);
        con.setRequestMethod("GET");

        // EXTRACT HTML
        InputStream stream = (InputStream) con.getContent();
        Scanner scanner = new Scanner(stream);
        String line;
        String output = "";

        // PARSE HTML AND FIND NUMBER
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.contains("id=\"result\" class=\"verbose\"")) {
                output = line.split("<span class='big'>")[1].split("<")[0];
                break;
            }
        }

        return Integer.parseInt(output);
    }
}
