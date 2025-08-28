public class Wizard extends Character{
    public Wizard(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void useWeapon() {
        System.out.println("I can hit monsters with my staff.");
    }

    public void wearArmor() {}

    public void castsSpell() {
        System.out.println("My real power is in my spells.");
    }

    public void solvesProblems() {
        System.out.println("I am the best problem solver in the party!");
    }

    public String toString() {
        return "I am a wizard. \nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC";
    }
}
