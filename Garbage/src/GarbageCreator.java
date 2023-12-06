package Garbage.src;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.exe";
        InputStream inputStream = GarbageCreator.class.getResourceAsStream(filename);

        if (inputStream == null) {
            System.out.println("File not found: " + filename);
            return;
        }

        long startTime, endTime;

        startTime = System.currentTimeMillis();
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.ISO_8859_1.name())) {
            StringBuilder outputStringBuilder = new StringBuilder();
            while (scanner.hasNext()) {
                outputStringBuilder.append(scanner.next());
            }
            String outputString = outputStringBuilder.toString();
            endTime = System.currentTimeMillis();
            System.out.println("Tuan.DT210907: " + (endTime - startTime));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
