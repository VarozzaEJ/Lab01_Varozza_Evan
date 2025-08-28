public class MartialWeaponWielder extends Character {
    public MartialWeaponWielder(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void useWeapon() {
        System.out.println("I wield martial weapons against monsters.");
    }
}