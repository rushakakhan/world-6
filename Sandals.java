public class Sandals extends Shoes {

  public Sandals(String name, String color) {
    super(name , color);
  }

  public boolean isFancy() {
    return false;
  }

  public boolean isSandal() {
    return true;
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    return false;
  }

  public boolean isGoodWithShorts() {
    return true;
  }

  public boolean isGoodWithCasualPants() {
    return true;
  }

  public boolean isGoodWithDressPants() {
    return false;
  }
}
