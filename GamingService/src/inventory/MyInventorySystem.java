package inventory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Constantin Küssner and Michael Herdt on 06.04.17.
 */
public class MyInventorySystem implements InventorySystem {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static HashMap<Integer, Item> itemCollection;
    public HashMap<Integer, Item> inventory = new HashMap<>();

    public static void main(String[] args) throws IOException{
        MyInventorySystem myInventorySystem = new MyInventorySystem();
        myInventorySystem.configureInventory();
        myInventorySystem.createCollection();
        myInventorySystem.showCollection();
        myInventorySystem.addItemToInventory();
    }

    /**
     * create the ItemCollection
     */
    private void createCollection() {
        itemCollection = new HashMap<>();

        Item boot = new Item("Boot", 50, 150);
        Item sword = new Item("Sword", 400, 1200);
        Item ring = new Item("Ring", 20, 800);
        Item dagger = new Item("Dagger", 70, 900);
        Item bow = new Item("Bow", 280, 1100);
        Item armor = new Item("Armor", 700, 1800);
        Item helmet = new Item("Helmet", 120, 400);

        addToCollection(boot);
        addToCollection(sword);
        addToCollection(ring);
        addToCollection(dagger);
        addToCollection(bow);
        addToCollection(armor);
        addToCollection(helmet);

    }

    /**
     *
     * @param Item
     */
    private void addToCollection(Item Item) {
        int i = itemCollection.size();
        itemCollection.put(i, Item);
    }

    @Override
    public void showCollection() {
        for (int i = 0; i < itemCollection.size(); i++) {
            System.out.println("Key ==> " + i);
            System.out.println("Name ==> " + itemCollection.get(i).getName());
            System.out.println("Value ==> " +itemCollection.get(i).getValue());
            System.out.println("Weight ==> " +itemCollection.get(i).getWeight());
            System.out.println("------------------------------------");
        }
    }

    @Override
    public void configureInventory() throws IOException {
        System.out.println("Input the MAXIMUM volume of the Inventory:" );
        int maxVolume = Integer.parseInt(reader.readLine());
        Inventory.setMAXvolume(maxVolume);
        System.out.println("Input the MAXIMUM weight of the Inventory:" );
        int maxWeight = Integer.parseInt(reader.readLine());
        Inventory.setMAXweight(maxWeight);
    }

    @Override
    public String askUserForName(String action) throws IOException {
        System.out.println("Input the name of the Item to " + action + " it:");
        String input = reader.readLine();
        return input;
    }

    @Override
    public void addItemToInventory() throws IOException {
        String addName = askUserForName("add");
        int sizePuffer = inventory.size();
        if (inventory.size() < Inventory.getMAXvolume()){
            for (int i = 0; i <= sizePuffer; i++) {
                if (inventory.get(i) == null) {
                    for (int ii = 0; ii < MyInventorySystem.itemCollection.size(); ii++) {
                        if (itemCollection.get(ii).getName().equals(addName)) {
                            inventory.put(i, itemCollection.get(ii));
                            ii = MyInventorySystem.itemCollection.size();
                        }
                    }

                }
            }
        }
        else if (inventory.size() >= Inventory.getMAXvolume()){
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("/////Cant added Item because of to much volume/////");
            System.out.println("///////////////////////////////////////////////////");
            removeItemFromInventory();
        }
        updateInventory();
        addItemToInventory();
    }


    @Override
    public void removeItemFromInventory() throws IOException {
        String removeName = askUserForName("remove");
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(removeName)) {
                inventory.remove(i);
                i = inventory.size();
            }
        }
        updateInventory();
        addItemToInventory();
    }



    @Override
    public void updateInventory() {
        System.out.println("-----------Inventory-----------");
        for (int i = 0; i < Inventory.getMAXvolume(); i++) {
            if (inventory.get(i) != null){
                System.out.println("Key ==> " + i);
                System.out.println("Name ==> " + inventory.get(i).getName());
                System.out.println("Value ==> " +inventory.get(i).getValue());
                System.out.println("Weight ==> " +inventory.get(i).getWeight());
                System.out.println("------------------------------------");
            }
        }
    }

    @Override
    public void reconfigureInventory() {

    }

    @Override
    public void calculateValue() {

    }

}
