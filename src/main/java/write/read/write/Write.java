package write.read.write;


import write.read.Read;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write extends Read {
    public void writeNew() throws IOException {
        String ss = "";
        BufferedReader reader = new BufferedReader(new FileReader(s));
        while (reader.ready())
        ss = reader.readLine();
        reader.close();
        FileWriter writer = new FileWriter(new Scanner(System.in).nextLine());
        System.out.println("Идет запись!" );
        writer.write(ss);
        writer.close();
    }
}
