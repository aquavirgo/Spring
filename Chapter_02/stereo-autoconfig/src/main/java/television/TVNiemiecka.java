package television;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component()
@Qualifier("tvNiemiecka")
public class TVNiemiecka implements KanalTv {
    @Override
    public void watch() {
        System.out.print("Telewizja Niemiecka");
    }
}
