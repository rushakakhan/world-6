public class Outfit {

  private Shirt shirt;
  private Pant pants;
  private Outerwear outerwear;
  private Shoes shoes;
  private Accessory accessory;

  public Outfit() {
    shirt = null;
    pants = null;
    outerwear = null;
    shoes = null;
    accessory = null;
  }

  public Shirt getShirt() {
    return shirt;
  }
  public Pant getPants() {
    return pants;
  }
  public Outerwear getOuterwear() {
    return outerwear;
  }
  public Shoes getShoes() {
    return shoes;
  }
  public Accessory getAccessory() {
    return accessory;
  }

  public void setShirt(Shirt newShirt) {
    shirt = newShirt;
  }
  public void setPants(Pant newPants) {
    pants = newPants;
  }
  public void setOuterwear(Outerwear newOuterwear) {
    outerwear = newOuterwear;
  }
  public void setShoes(Shoes newShoes) {
    shoes = newShoes;
  }
  public void setAccessory(Accessory newAccessory) {
    accessory = newAccessory;
  }

  public String toString() {
    return "A " + shirt + " and " + pants + " with " + shoes + ", " + accessory.toString() + ", and a " + outerwear + ".";
  }
}
