public class SimpleWeaponWielder extends Character {
    public SimpleWeaponWielder(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void useWeapon() {
        System.out.println("I wield simple weapons against monsters.");
    }
}
