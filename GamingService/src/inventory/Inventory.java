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
    static int actWeight = 0;
    static int actVolume;

    /**
     * Constructor for the Inventory with MAXweight, MAXvalue and MAXvolume
     *
     * @param invMAXweight
     * @param invMAXvolume
     * @param invACTweight
     * @param invACTvolume
     */
    public Inventory(int invMAXweight, int invMAXvolume, int invACTweight, int invACTvolume) {
        MAXweight = invMAXweight;
        MAXvolume = invMAXvolume;
        actWeight = invACTweight;
        actVolume = invACTvolume;

    }

    public static int getActWeight() {
        return actWeight;
    }

    public void setActWeight(int actWeight) {
        this.actWeight = actWeight;
    }

    public int getActVolume() {
        return actVolume;
    }

    public void setActVolume(int actVolume) {
        this.actVolume = actVolume;
    }

    public static int getMAXweight() {
        return MAXweight;
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
