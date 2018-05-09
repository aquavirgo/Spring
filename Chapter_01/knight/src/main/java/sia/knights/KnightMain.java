package sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;
import sia.knights.config.KnightConfig;

public class KnightMain {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(
            "META-INF/spring/minstrel.xml");

  //  Knight knight = context.getBean(BraveKnight.class);

    /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(KnightConfig.class);
    context.refresh();
    Knight knight = (Knight) context.getBean("entitlement");*/
  //  knight.embarkOnQuest();

    Knight d= (Knight) context.getBean("knight");
    d.embarkOnQuest();
    context.close();
  }

}
