public class Earrings extends Accessory {

  private Boolean fancy;

  public Earrings(String type, String color) {
    super(type + " Earrings", color, "earrings");
    fancy = true;
  }

  public Earrings(String type, String color, Boolean isFancy) {
    super(type + " Earrings", color);
    fancy = isFancy;
  }

  public boolean isFancy() {
    if (fancy) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGoodWithDressShoes() {
    if (fancy) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGoodWithSandals() {
    return false;
  }

  public boolean isGoodWithCasualShoes() {
    if (fancy) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithShorts() {
    if (fancy) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithCasualPants() {
    if (fancy) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithDressPants() {
    if (fancy) {
      return true;
    } else {
      return false;
    }
  }  

  public boolean isGoodWithBoots() {
    return true;
  }
}