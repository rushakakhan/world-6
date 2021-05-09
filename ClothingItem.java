public abstract class ClothingItem {

  protected String name;
  protected String type;
  protected String color;

  public ClothingItem(String newName, String newType, String newColor) {
      name = newName;
      type = newType;
      color = newColor;
  }
  
  public String getName() {
    return name;
  }
  public String getType() {
    return type;
  }
  public String getColor() {
    return color;
  }

  public void setName(String newName) {
    name = newName;
  }
  public void setColor(String newColor) {
    color = newColor;
  }

  public boolean isColorful() {
    if (color == "white" || color == "black" || color == "grey" || color == "brown") {
      return false;
    } else {
      return true;
    }
  }

  public String toString() {
    return color + " " + name;
  }
}
