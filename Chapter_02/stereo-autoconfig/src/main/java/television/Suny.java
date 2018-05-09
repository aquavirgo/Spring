package television;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("suny")
public class Suny implements TV {
    KanalTv kanalTv;
    String opis;
    @Autowired
    Suny(KanalTv kanalTv){
        this.kanalTv = kanalTv;
        opis = "Suny";
    }
    @Override
    public void watch() {
        kanalTv.watch();
    }

    @Override
    public String getOpis() {
        return opis;
    }
}
