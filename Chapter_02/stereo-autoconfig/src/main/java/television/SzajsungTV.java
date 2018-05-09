package television;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("szajsungTV")
public class SzajsungTV implements TV {

    private KanalTv kanalTv;
    String opis;

    @Autowired
    SzajsungTV(KanalTv kanalTv){
        this.kanalTv = kanalTv;
        opis = "Szajsung";
    }
    @Override
    public void watch() {
    kanalTv.watch();
    }

    public String getOpis(){
        return opis;
    }
}
