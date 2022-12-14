/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("app/src/main/resources/gates.js");
        errorCount(file);
    }

    public static int errorCount(Path file) throws IOException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        int lineCount = 0;
        while (scanner.hasNextLine()) {
            lineCount++;
            String line = scanner.nextLine();

            if (!line.endsWith(";")) {
                if (line.endsWith("{") || line.endsWith("}") || line.endsWith("else") || line == "" || line.contains("if")) {

                } else {
                    count++;
                    System.out.println("Line: " + lineCount + " Missing semicolon");
                }
            }
        }
        return count;
    }
}

