package write.read;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public final static String s="C:\\Users\\Sherbanyuk\\Desktop\\Змеи\\1.java";
    public void read() throws IOException
    {
        BufferedReader reader=new BufferedReader(new FileReader(s));
        while (reader.ready())
        System.out.println(reader.readLine());
        reader.close();
    }


}
