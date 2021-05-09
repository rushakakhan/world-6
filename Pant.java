public abstract class Pant extends ClothingItem implements NonAccessory, NonShoe, ClothingStyles {
  
  public Pant(String name, String color) {
    super(name, "pant", color);
  }

  public Pant(String name, String color, boolean isShort) {
    super(name, "short", color);
  }

  public abstract boolean isFancy();
  public abstract boolean isGoodWithEarrings();
  public abstract boolean isGoodWithTie();
  public abstract boolean isGoodWithDressShoes();
  public abstract boolean isGoodWithSandals();
  public abstract boolean isGoodWithCasualShoes();

  public String toString() {
    return color + " " + name;
  }
}
