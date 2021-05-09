## CS2 World 6: Outfit Generator Problem

#### Object Hierarchy

For the object hierarchy, I used the overarching **ClothingItem** class, which has general attributes like **name**, **type**, **color** as well as general methods like toString() and all getters and setters for those general attributes.

Then I made each clothing type it's own subclass ie. **Shirt**, **Pant**, **Shoes**, **Outerwear**, and **Accessory**, with some unique methods and a bunch of abstract methods that align with each of the assigned interface. I used interfaces in this second level of classes to make sure each specific subclass of each clothign type, had all the appropriate methods. I also made a bunch of the methods abstract to make sure that each subclass was required to override and set their own values for those methods.

#### Unique Characteristics

The main characteristics I used were:

- color
- isFancy
- isColorful 
- type (used to differentiate shorts from pants under Pant class, and earrings and ties under the Accessory class)

Some class types used:
- isShortSleeved (used for certain shirt types to determine if the button up shirt was fancy or not)
- isShorts (to differentiate between shorts and longer pants, who all fall under the **Pant** superclass)

#### Rules used to determine good outfit

- if shoes were fancy, all other clothes needed to be fancy
- Shorts do not go with boots
- winter jackets do not go with shorts or sandals
- turtlenecks do not go with ties
- ties only go with fancy shirts


#### Please note: 
*Due to running out of time the rules used and the code to implement them is a bit unpolished. But if you run the **OutfitGenTest.java** file, you can see that it still works to print out 10 decent outfit combinations. The part that remains unfinished is incorporating colors into the rules that determine a good outfit.*



