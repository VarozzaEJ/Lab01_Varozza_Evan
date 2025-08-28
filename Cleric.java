public class Cleric extends SimpleWeaponWielder {
    //NOTE override the useWeapon() method because medium armor wearer extends martial weapon wielder.
    public Cleric(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void wearArmor() {
        System.out.println("I wear medium armor");
    }

    public void castsSpell() {
        System.out.println("My real power is in my spells!");
    }
    
    public void healsOthers() {
        System.out.println("My friends rely upon my medical skills.");
    }

    public String toString() {
        return "I am a cleric. \nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC";
    }
}
