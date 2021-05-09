public class OutfitGenTester {


  public static void main(String args[]) {

      Shirt[] shirtsArray = new Shirt[10];
      Pant[] pantsArray = new Pant[10];
      Shoes[] shoesArray = new Shoes[10];
      Outerwear[] outerwearArray = new Outerwear[10];
      Accessory[] accessoriesArray = new Accessory[11];

      shirtsArray[0] = new TShirt("funky band tee", "white");
      shirtsArray[1] = new ButtonUpShirt("Short-sleeved button-up plaid", "blue", true);
      shirtsArray[2] = new ButtonUpShirt("fancy button-up", "white", false);
      shirtsArray[3] = new ButtonUpShirt("fancy button-up with pin stripes", "white", false);
      shirtsArray[4] = new Turtleneck("low profile turtleneck", "black");
      shirtsArray[5] = new Sweater("comfy crew neck sweatshirt", "tan");
      shirtsArray[6] = new Sweater("hooded sweatshirt with cool decal on back", "yellow");
      shirtsArray[7] = new TShirt("plain everyday t-shirt", "navy");
      shirtsArray[8] = new TShirt("plain everyday t-shirt", "white");
      shirtsArray[9] = new ButtonUpShirt("fancy button-up", "black", false);

      pantsArray[0] = new Jeans("skinny jeans", "black");
      pantsArray[1] = new Jeans("faded dad jeans", "light-blue");
      pantsArray[2] = new Jeans("ripped rockstar jeans", "faded black");
      pantsArray[3] = new Khakis("standard khakis", "tan");
      pantsArray[4] = new Khakis("khaki flood pants", "green");
      pantsArray[5] = new Slacks("plaid slacks", "grey");
      pantsArray[6] = new Slacks("fancy slacks", "black");
      pantsArray[7] = new Slacks("everyday slacks", "blue");
      pantsArray[8] = new Shorts("cut-off jean shorts", "faded blue");
      pantsArray[9] = new Shorts("swim shorts", "red");

      shoesArray[0] = new RunningShoes("nike running", "red");
      shoesArray[1] = new RunningShoes("funky aesics running", "rainbow");
      shoesArray[2] = new RunningShoes("Adidas running", "white and black");
      shoesArray[3] = new Sandals("birkenstocks", "brown leather and tan");
      shoesArray[4] = new Sandals("thong sandals", "black");
      shoesArray[5] = new LeatherCombatBoots("black");
      shoesArray[6] = new LeatherCombatBoots("tan");
      shoesArray[7] = new DressShoes("black");
      shoesArray[8] = new DressShoes("brown leather");
      shoesArray[9] = new RunningShoes("All Birds", "dark-green");

      outerwearArray[0] = new JeanJacket("dark-blue");
      outerwearArray[1] = new JeanJacket("faded black");
      outerwearArray[2] = new JeanJacket("Jean Jacket with colorful patch designs", "light-blue");
      outerwearArray[3] = new WindBreaker("North Face Wind-breaker", "Black and orange");
      outerwearArray[4] = new Blazer("Single button blazer", "dark-blue");
      outerwearArray[5] = new Blazer("Three button blazer", "black");
      outerwearArray[6] = new WinterJacket("Patagonia Winter Jacket", "white");
      outerwearArray[7] = new WinterJacket("Canada Goose Winter Jacket", "red");
      outerwearArray[8] = new PeaCoat("Wool Pea Coat", "grey");
      outerwearArray[9] = new SpringJacket("Patagonia Light Puffy Jacket", "charcoal");

      accessoriesArray[0] = new BallCap("Fitted Yankees Cap", "navy");
      accessoriesArray[1] = new BallCap("Patagonia Snap-back", "black");
      accessoriesArray[2] = new Beanie("Wool Beanie", "black");
      accessoriesArray[3] = new Beanie("Wool Beanie", "mustard");
      accessoriesArray[4] = new Earrings("1-inch hoop", "gold");
      accessoriesArray[5] = new Earrings("Triangle", "gold");
      accessoriesArray[6] = new Earrings("Trippy hexagon", "red");
      accessoriesArray[7] = new Tie("Skinny Tie", "black");
      accessoriesArray[8] = new Tie("Skinny Tie", "red");
      accessoriesArray[9] = new Watch("Apple Watch", "blue");
      accessoriesArray[10] = new Watch("Rolex", "gold");

      OutfitGenerator outfitGen = new OutfitGenerator(shirtsArray, pantsArray, outerwearArray, shoesArray, accessoriesArray);

      for (int i = 0; i < 10; i++) {
        Outfit outfit = outfitGen.generateOutfit();
        System.out.println(outfit.toString());
      }
  }
  
}
