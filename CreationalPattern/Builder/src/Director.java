public class Director {
  public void construct(Builder builder) {
    builder.buildPartA();
    builder.buildPartB();
    builder.buildPartC();
  } // 부를때, concreteBuilder를 넣는다.
}
