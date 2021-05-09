public class Jeans extends Pant {

  public Jeans(String name, String color) {
    super(name, color);
  }

  public boolean isFancy() {
    return false;
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    return false;
  }

  public boolean isGoodWithDressShoes() {
    if (color == "black") {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGoodWithSandals() {
    return true;
  }

  public boolean isGoodWithCasualShoes() {
    return true;
  }

  public boolean isGoodWithBoots() {
    return true;
  }
}