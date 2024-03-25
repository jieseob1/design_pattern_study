public class ConcretePrototype implements Prototype{

  private String field;

  public ConcretePrototype(String field) {
    this.field = field;
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototype(field);
  }

  public void setField(String field) {
    this.field = field;
  }

  public String getField() {
    return field;
  }
}
