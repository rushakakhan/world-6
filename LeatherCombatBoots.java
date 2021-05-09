public class LeatherCombatBoots extends Shoes {

  public LeatherCombatBoots(String color) {
    super("Leather Combat Boots", color);
  }

  public boolean isFancy() {
    return false;
  }

  public boolean isSandal() {
    return false;
  }

  public boolean isGoodWithEarrings() {
    return true;
  }

  public boolean isGoodWithTie() {
    return false;
  }

  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithCasualPants() {
    return true;
  }

  public boolean isGoodWithDressPants() {
    return false;
  }  
}
