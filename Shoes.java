public abstract class Shoes extends ClothingItem implements ClothingStyles, NonAccessory, NonPant {
  
  public Shoes(String name, String color) {
    super(name, "shoes", color);
  }

  public abstract boolean isFancy();
  public abstract boolean isSandal();
  public abstract boolean isGoodWithEarrings();
  public abstract boolean isGoodWithTie();
  public abstract boolean isGoodWithShorts();
  public abstract boolean isGoodWithCasualPants();
  public abstract boolean isGoodWithDressPants();
}
