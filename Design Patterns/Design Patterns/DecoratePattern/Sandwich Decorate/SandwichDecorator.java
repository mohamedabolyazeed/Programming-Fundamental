public abstract class SandwichDecorator implements Sandwich {

  private Sandwich sandwich;

  public SandwichDecorator(Sandwich sandwich) {
    this.sandwich = sandwich;
  }

  @Override
  public double getcost() {
    return sandwich.getcost();
  }

  @Override
  public String getdescription() {
    return sandwich.getdescription();
  }

}
