public class Slacks extends Pant {

  public Slacks(String name, String color) {
    super(name, color);
  }

  public boolean isFancy() {
    return true;
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    return true;
  }

  public boolean isGoodWithDressShoes() {
    return true;
  }

  public boolean isGoodWithSandals() {
    return false;
  }

  public boolean isGoodWithCasualShoes() {
    return false;
  }

  public boolean isGoodWithBoots() {
    return false;
  }
}
