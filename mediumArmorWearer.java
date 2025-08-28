public class mediumArmorWearer extends MartialWeaponWielder {
    public mediumArmorWearer(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);

    }
    public void wearArmor() {
        System.out.println("I wear medium armor!");
    }
}
