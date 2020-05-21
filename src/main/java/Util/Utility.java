package Util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Utility {

    public static void write(String textWrite) {

        try {
            // We create a text file in file directory
            PrintWriter outfile = new PrintWriter(new File("text.txt"));

            outfile.write(textWrite);
            outfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
