public class DressShoes extends Shoes {

  public DressShoes(String color) {
    super("Dress Shoes", color);
  }

  public boolean isFancy() {
    return true;
  }

  public boolean isSandal() {
    return false;
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    return true;
  }

  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithCasualPants() {
    return false;
  }

  public boolean isGoodWithDressPants() {
    return true;
  }
}
