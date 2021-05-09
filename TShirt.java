public class TShirt extends Shirt {

  public TShirt(String name, String color) {
    super(name, color, true);
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
    return true;
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

