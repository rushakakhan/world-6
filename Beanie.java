public class Beanie extends Accessory {

  public Beanie(String color) {
    super("Beanie", color);
  }

  public Beanie(String name, String color) {
    super(name, color);
  }

  public boolean isFancy() {
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

  public boolean isGoodWithShorts() {
    return false;
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
    return "a " + color + " " + name;
  }
}
