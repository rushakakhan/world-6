import java.util.Random;

public class OutfitGenerator {

  private Shirt[] shirtsArray;
  private Pant[] pantsArray;
  private Outerwear[] outerwearArray;
  private Shoes[] shoesArray;
  private Accessory[] accessoriesArray;

  public OutfitGenerator() {
    shirtsArray = null;
    pantsArray = null;
    outerwearArray = null;
    shoesArray = null;
    accessoriesArray = null;
  }

  public OutfitGenerator(Shirt[] shirts, Pant[] pants, Outerwear[] outerwears, Shoes[] shoes, Accessory[] accessories) {
    shirtsArray = shirts;
    pantsArray = pants;
    outerwearArray = outerwears;
    shoesArray = shoes; 
    accessoriesArray = accessories;
  }

  public ClothingItem getRandom(ClothingItem[] array) {

    Random rand = new Random();
    int index = rand.nextInt(array.length);

    //System.out.println(array[index].toString());

    return array[index];
  }

  public Outfit generateOutfit() {

    Outfit outfit = new Outfit();

    Shirt shirt = (Shirt)getRandom(shirtsArray);
    Pant pants = (Pant)getRandom(pantsArray);
    Outerwear outerwear = (Outerwear)getRandom(outerwearArray);
    Shoes shoes = (Shoes)getRandom(shoesArray);
    Accessory accessory = (Accessory)getRandom(accessoriesArray);

    if (shoes.isFancy()) {

      while (!shirt.isFancy()) {
        shirt = (Shirt)getRandom(shirtsArray);
      }

      while (!pants.isFancy()) {
        pants = (Pant)getRandom(pantsArray);
      }

      if (!shirt.isGoodWithTie()) {
        while (!accessory.isFancy() || accessory.type == "tie") {
          accessory = (Accessory)getRandom(accessoriesArray);
        }
      }

      while (!outerwear.isFancy()) {
        outerwear = (Outerwear)getRandom(outerwearArray);
      }

    } else {

      if (shoes.isSandal()) {

        while (!shirt.isGoodWithSandals()) {
          shirt = (Shirt)getRandom(shirtsArray);
        }
  
        while(!outerwear.isGoodWithSandals()) {
          outerwear = (Outerwear)getRandom(outerwearArray);
        }
  
        while(!pants.isGoodWithSandals()) {
          pants = (Pant)getRandom(pantsArray);
        }
  
        while(!accessory.isGoodWithSandals()) {
          accessory = (Accessory)getRandom(accessoriesArray);
        }

      } else {

        while (!shirt.isGoodWithCasualShoes()) {
          shirt = (Shirt)getRandom(shirtsArray);
        }

        while(!pants.isGoodWithCasualShoes()) {
          pants = (Pant)getRandom(pantsArray);
        }

        if (pants.getType() == "short") {

          while(!outerwear.isGoodWithCasualShoes() || !outerwear.isGoodWithShorts()) {
            outerwear = (Outerwear)getRandom(outerwearArray);
          }

          while(!accessory.isGoodWithCasualShoes() || !accessory.isGoodWithShorts()) {
            accessory = (Accessory)getRandom(accessoriesArray);
          }

        } else {

          while(!outerwear.isGoodWithCasualShoes()) {
            outerwear = (Outerwear)getRandom(outerwearArray);
          }

          while(!accessory.isGoodWithCasualShoes()) {
            accessory = (Accessory)getRandom(accessoriesArray);
          }
        }
      }
    }

    outfit.setShirt(shirt);
    outfit.setPants(pants);
    outfit.setOuterwear(outerwear);
    outfit.setAccessory(accessory);
    outfit.setShoes(shoes);

    return outfit;
  }
  
}
