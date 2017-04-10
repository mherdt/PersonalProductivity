package inventory;

import java.io.IOException;

/**
 * Created by Constantin Küssner and Michael Herdt on 06.04.17.
 *
 */
public interface InventorySystem {

    /**
     * Method showCollection gives out all Items that fill
     * the Collection at the moment
     */
    public void showCollection();

    /**
     * Method configureInventory asks the User to insert the
     * MAXweight, MAXvalue and MAXvolume of the inventory
     */
    public void configureInventory() throws IOException;

    /**
     * Method askUserForName asks the User for the name of the Item
     * that should be added to the inventory
     */
    public String askUserForName(String action) throws IOException;

    /**
     * Method addItemToInventory takes the item out of the Collection
     * and puts it into the inventory
     */
    public void addItemToInventory() throws IOException;

    /**
     * Method removeItemFromInventory deletes the item that is
     * currently in the inventory
     */
    public void removeItemFromInventory() throws IOException;

    /**
     * Method updateInventory is used everytime something visually
     * changes in the User Interface, for example if a new item is added
     */
    public void updateInventory();

    /**
     * Method reconfigureInventory is used to change the
     * MAXvolume, MAXweight and MAXvalue of the inventory
     * when it has already been created
     */
    public void reconfigureInventory();

    /**
     *
     *
     *
     */
    public void calculateValue();

}
