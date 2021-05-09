public class Watch extends Accessory {
  
  public Watch(String name, String color) {
    super(name, color);
  }

  public boolean isFancy() {
    if (color == "black" || color == "gold" || color == "silver") {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGoodWithDressShoes() {
    if (this.isFancy()) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGoodWithSandals() {
    if (this.isFancy()) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithCasualShoes() {
    if (this.isFancy()) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithShorts() {
    if (this.isFancy()) {
      return false;
    } else {
      return true;
    }
  }

  public boolean isGoodWithCasualPants() {
    return true;
  }

  public boolean isGoodWithDressPants() {
    if (this.isFancy()) {
      return true;
    } else {
      return false;
    }
  }  

  public boolean isGoodWithBoots() {
    return true;
  }

  public String toString() {
    return "a " + color + " " + name;
  }
}