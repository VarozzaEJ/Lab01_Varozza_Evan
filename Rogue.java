public class Rogue extends LightArmorWearer {
    public Rogue(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void sneaksAround() {
        System.out.println("I am very sneaky!");
    }

    public void picksLock() {
        System.out.println("Picking locks is my specialty!");
    }

    public String toString() {
        return "I am a rogue. \nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC";
    }
}
