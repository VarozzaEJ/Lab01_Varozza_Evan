public class Ranger extends MediumArmorWearer {
    public Ranger(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void sneaksAround() {
        System.out.println("I am very sneaky!");
    }

    public void willToSurvive() {
        System.out.println("I will survive in the wild!");
    }

    public String toString() {
        return "I am a ranger. \nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC";
    }
}
