public abstract class Outerwear extends ClothingItem implements NonAccessory, NonShoe, NonPant, ClothingStyles {
  
  public Outerwear(String name, String color) {
    super(name, "outerwear", color);
  }

  public abstract boolean isFancy();
  public abstract boolean isGoodWithEarrings();
  public abstract boolean isGoodWithTie();
  public abstract boolean isGoodWithDressShoes();
  public abstract boolean isGoodWithSandals();
  public abstract boolean isGoodWithCasualShoes();
  public abstract boolean isGoodWithShorts();
  public abstract boolean isGoodWithCasualPants();
  public abstract boolean isGoodWithDressPants();
  public abstract boolean isGoodWithBoots();
}
