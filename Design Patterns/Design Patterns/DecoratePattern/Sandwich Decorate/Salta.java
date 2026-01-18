public class Salta extends SandwichDecorator {

  public Salta(Sandwich sandwich) {
    super(sandwich);
  }

  @Override
  public double getcost() {
    return super.getcost() + 5;
  }

  @Override
  public String getdescription() {
    return super.getdescription() + " Added salad";
  }

}
