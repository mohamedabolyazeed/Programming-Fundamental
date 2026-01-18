public class Zethar extends SandwichDecorator {

  public Zethar(Sandwich sandwich) {
    super(sandwich);
  }

  @Override
  public double getcost() {
    return super.getcost() + 3;
  }

  @Override
  public String getdescription() {
    return super.getdescription() + " Added Zethar";
  }
}
