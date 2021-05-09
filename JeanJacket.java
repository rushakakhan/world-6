public class JeanJacket extends Outerwear {

  public JeanJacket(String color) {
    super("Jean Jacket", color);
  }

  public JeanJacket(String name, String color) {
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
    return true;
  }
}
