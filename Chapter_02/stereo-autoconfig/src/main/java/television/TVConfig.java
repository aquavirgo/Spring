package television;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class TVConfig {

    @Bean
    public KanalTv kanalTv() {
        return new Polszmat();
    }
}
