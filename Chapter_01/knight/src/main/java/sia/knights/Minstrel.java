package sia.knights;

import java.io.PrintStream;

public class Minstrel {

  private PrintStream stream;
  
  public Minstrel(PrintStream stream) {
    this.stream = stream;
  }

  public void singBeforeQuest() {
    stream.println("Zapierdalam na wojne!");
  }

  public void singAfterQuest() {
    stream.println("Powrot wks wks");
  }

}
