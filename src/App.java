
public class App {


  public static void main(String[] args) {

    Logger asteriskLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();

    asteriskLogger.log("I've had 4 slices of cake today");
    asteriskLogger.error("Too many slices of cake");
    spacedLogger.log("Welcome");
    spacedLogger.error("Not Welcome");
  }

}
