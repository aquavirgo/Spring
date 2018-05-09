package television;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= TVConfig.class)
public class TVTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    @Qualifier("tvNiemiecka")
    private KanalTv kanalTv;

    @Autowired
    @Qualifier("suny")
    private TV tv;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(tv);
    }

    @Test
    public void kaindOfTV(){
        System.out.print(tv.getOpis());
    }

   @Test
    public void play() {
        kanalTv.watch();
        assertEquals(
                "Telewizja Niemiecka",
                log.getLog());
    }
}
