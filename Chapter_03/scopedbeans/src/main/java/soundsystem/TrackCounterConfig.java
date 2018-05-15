package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Peppers");
        cd.setArtist("The Beatels");

        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt. Peppers");
        tracks.add("The Beatls");
        tracks.add("Janusz i Grazyna");
        tracks.add("The UFC");

    cd.setTracks(tracks);
    return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
