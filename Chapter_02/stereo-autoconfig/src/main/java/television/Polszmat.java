package television;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component()
@Qualifier("polszmat")
public class Polszmat implements KanalTv {
    @Override
    public void watch() {
        System.out.print("Ogladasz Polszmat");
    }
}
