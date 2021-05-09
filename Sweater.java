public class Sweater extends Shirt {

  public Sweater(String name, String color) {
    super(name, color, false);
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
    return false;
  }

  public boolean isGoodWithSandals() {
    return false;
  }

  public boolean isGoodWithCasualShoes() {
    return true;
  }

  public boolean isGoodWithCasualPants() {
    return true;
  }

  public boolean isGoodWithDressPants() {
    return false;
  }

  public boolean isGoodWithBoots() {
    return true;
  }

  public String toString() {
    return color + " " + name;
  }
}

