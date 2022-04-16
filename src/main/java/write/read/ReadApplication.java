package write.read;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import write.read.write.Write;

import java.io.IOException;
public class ReadApplication {
	//"C:\\Users\\Sherbanyuk\\Desktop\\Змеи\\3.java"
	public static void main(String[] args) throws IOException {

		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(MyConfig.class);

//Read read=context.getBean("readPage",Read.class);
//read.read();

		Write write=context.getBean("writePage",Write.class);
		write.writeNew();
		context.close();
	}
}



