package television;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pokoj {

    @Autowired
    @Qualifier("polszmat")
    private KanalTv kanalTv;

    public void ogladaj(){
        kanalTv.watch();
    }
}
