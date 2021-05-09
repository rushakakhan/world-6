public abstract class Accessory extends ClothingItem implements NonShoe, NonPant, ClothingStyles {

  public Accessory(String name, String color) {
    super(name, "accessory", color);
  }

  public Accessory(String name, String color, String type) {
    super(name, type, color);
  }

  public abstract boolean isFancy();
  public abstract boolean isGoodWithDressShoes();
  public abstract boolean isGoodWithSandals();
  public abstract boolean isGoodWithCasualShoes();  
  public abstract boolean isGoodWithShorts();
  public abstract boolean isGoodWithCasualPants();
  public abstract boolean isGoodWithDressPants();
  public abstract boolean isGoodWithBoots();
}
