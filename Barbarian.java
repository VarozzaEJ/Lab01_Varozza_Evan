public class Barbarian extends MediumArmorWearer {
    public Barbarian(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public String toString() {
        return "I am a barbarian. \nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC";
    }

    public void tendsToRage() {
        System.out.println("When I get angry, I fight better!");
    }
}
