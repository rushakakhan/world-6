public class Turtleneck extends Shirt {

  public Turtleneck(String name, String color) {
    super(name, color, false);
  }

  public boolean isFancy() {
    return true;
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    return false;
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

  public boolean isGoodWithCasualPants() {
    return false;
  }

  public boolean isGoodWithDressPants() {
    return true;
  }

  public boolean isGoodWithBoots() {
    return true;
  }

  public String toString() {
    return color + " " + name;
  }
}

