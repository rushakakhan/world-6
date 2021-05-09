public class ButtonUpShirt extends Shirt {

  public ButtonUpShirt(String name, String color, Boolean shortSleeved) {
    super(name, color, shortSleeved);
  }

  public boolean isFancy() {
    if (isShortSleeved) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    if (isShortSleeved) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithDressShoes() {
    return true;
  }

  public boolean isGoodWithSandals() {
    if (isShortSleeved) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGoodWithCasualShoes() {
    if (isShortSleeved) {
      return true;
    } else {
      return false;
    }
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
