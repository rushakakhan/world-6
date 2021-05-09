public class Tie extends Accessory {

  public Tie(String name, String color) {
    super(name, color, "tie");
  }

  public boolean isFancy() {
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

  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithCasualPants() {
    return false;
  }

  public boolean isGoodWithDressPants() {
    return true;
  }  

  public boolean isGoodWithBoots() {
    return false;
  }

  public String toString() {
    return "a " + color + " " + name;
  }
}
