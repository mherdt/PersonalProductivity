package inventory;

/**
 * Created by Michael Herdt and Constantin Kuessner on 20.03.2017.
 * Updated on 03.04.2017
 *
 * Class to initialize ID, name, weight and value of an Item
 *
 */
public class Item{

    String name;
    int weight;
    int value;

    /**
     * Contructor for an Item with itemID, itemName, itemWeight and itemValue
     * @param itemName
     * @param itemWeight
     * @param itemValue
     */
    public Item(String itemName, int itemWeight, int itemValue) {
        name = itemName;
        weight = itemWeight;
        value = itemValue;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getValue() {
        return this.value;
    }
}