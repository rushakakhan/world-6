public abstract class Shirt extends ClothingItem implements NonAccessory, NonShoe, ClothingStyles, NonPant {

  public boolean isShortSleeved;

  public Shirt(String name, String color) {
    super(name, "shirt", color);
  }
  public Shirt(String name, String color, Boolean shortSleeved) {
    super(name, "shirt", color);
    isShortSleeved = shortSleeved;
  }

  public abstract boolean isFancy();
  public abstract boolean isGoodWithEarrings();
  public abstract boolean isGoodWithTie();
  public abstract boolean isGoodWithDressShoes();
  public abstract boolean isGoodWithSandals();
  public abstract boolean isGoodWithCasualShoes();
  public abstract boolean isGoodWithCasualPants();
  public abstract boolean isGoodWithDressPants();

  public boolean isGoodWithShorts() {
    if (isShortSleeved) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return color + " " + name + " shirt";
  }
}
