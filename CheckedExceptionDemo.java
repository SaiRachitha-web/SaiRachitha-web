import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file); // Checked Exception
            System.out.println("File opened successfully");
        }
        catch (IOException e) {
            System.out.println("File not found or error while reading file");
        }
    }
}

