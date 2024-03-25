public class Singleton {

  private static Singleton instance;

  private Singleton() {}

  public static Singleton getInstance() {
    if (instance == null) {
      makeInstance();
    }
    return instance;
  }

  private static void makeInstance() {
    instance = new Singleton();
  }
}
