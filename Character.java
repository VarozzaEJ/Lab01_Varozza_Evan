//NOTE Hierarchy goes     Character -------------------------\
//                           |                                \
//Martial Weapon Wielder           Simple Weapon Wielder      Wizard
//      |              \                    |           \
//  Medium Armor Wearer  Knight     Light Armor Wearer    Cleric
//       |       \                        |
//   Barbarian    Ranger              Rogue

public class Character {
    protected int hitPoints, armorClass;
    protected String armorType, weaponType;

    public Character(int hitPoints, int armorClass, String armorType, String weaponType) {
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.armorType = armorType;
        this.weaponType = weaponType;
    }

    public void wearArmor() {
        System.out.println("I wear " + this.armorType + " armor!");
    }
}
