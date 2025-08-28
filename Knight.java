public class Knight extends MartialWeaponWielder {
    public Knight(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public String toString() {
        return "I am a knight. \nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC";
    }

    public void hasManeuvers() {
        System.out.println("I got some pretty cool fighting moves!");
    }
}
