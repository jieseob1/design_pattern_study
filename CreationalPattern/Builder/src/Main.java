public class Main {
  public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();
    new Director().construct(builder); // 디렉터에서 생성 순서를 만들어준다.
    Product product = builder.getResult(); // set을 끝내고, builder의 결과로써, product 받아옴
    product.show(); // 결과 보여준다.
  }
}