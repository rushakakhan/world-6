public class RunningShoes extends Shoes {

  public RunningShoes(String name, String color) {
    super(name , color);
  }

  public boolean isFancy() {
    return false;
  }

  public boolean isSandal() {
    return false;
  }

  public boolean isGoodWithEarrings() {
    return false;
  }

  public boolean isGoodWithTie() {
    return false;
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

  public String toString() {
    return color + " " + name + " shoes";
  }
}
