public class PeaCoat extends Outerwear {

  public PeaCoat(String name, String color) {
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

  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithCasualPants() {
    return true;
  }

  public boolean isGoodWithDressPants() {
    return true;
  }

  public boolean isGoodWithBoots() {
    return true;
  }  
  
}
