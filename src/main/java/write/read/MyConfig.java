package write.read;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import write.read.write.Write;

@Configuration
public class MyConfig {
@Bean
public Read readPage()
{
    return new Read();
}
@Bean
@Qualifier
public Write writePage() {
    return new Write();
}

}
