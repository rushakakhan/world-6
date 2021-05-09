public class BallCap extends Accessory {

  public BallCap(String name, String color) {
    super(name, color);
  }

  public boolean isFancy() {
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

  public boolean isGoodWithShorts() {
    return true;
  }

  public boolean isGoodWithCasualPants() {
    return true;
  }

  public boolean isGoodWithDressPants() {
    return false;
  }  

  public boolean isGoodWithBoots() {
    return false;
  }

  public String toString() {
    return "a " + color + " " + name;
  }
}
