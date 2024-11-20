import java.util.*;
import java.io.*;

public class Q2_JSON_spiro {

    public static void main(String[] args) {
        double R = 36.0;
        double r = 9.0;
        double a = 30.0;

        double CENTER_LON = -118.285443;
        double CENTER_LAT = 34.020570;

        double t = 0.0;
        double n = 8.0;

        try {
            File myObj = new File("HW4_spiral_gen.json");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter("HW4_spiral_gen.json", false);

            myWriter.write("[\n");

            double step = 0.1;

            while (t < n * Math.PI) {
                t += step;
                double x = (R + r) * Math.cos((r/R) * t) - a * Math.cos((1 + r/R) * t);
                double y = (R + r) * Math.sin((r/R) * t) - a * Math.sin((1 + r/R) * t);

                x = x / 100000.0;
                y = y / 100000.0;

                x += CENTER_LON;
                y += CENTER_LAT;

                myWriter.write("{ \"loc\": [" + x + "," + y + "] }");
                if (t < n * Math.PI - step) {
                    myWriter.write(",\n");
                }
            }

            myWriter.write("\n]");
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
