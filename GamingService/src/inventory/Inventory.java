package inventory;

/**
 * Created by Constantin Küssner and Michael Herdt on 03.04.17.
 *
 * Class that initializes MAXweight and MAXvalue and MAXvolume of the inventory
 *
 */
public class Inventory{

    static int MAXweight;
    static int MAXvolume;

    /**
     * Constructor for the Inventory with MAXweight, MAXvalue and MAXvolume
     * @param INVweight
     * @param INVvolume
     */
    public Inventory(int INVweight, int INVvolume) {
        MAXweight = INVweight;
        MAXvolume = INVvolume;
    }


    public int getMAXweight() {
        return this.MAXweight;
    }

    public static int getMAXvolume() {
        return MAXvolume;
    }

    public static void setMAXweight(int MAXweight) {
        Inventory.MAXweight = MAXweight;
    }

    public static void setMAXvolume(int MAXvolume) {
        Inventory.MAXvolume = MAXvolume;
    }
}
