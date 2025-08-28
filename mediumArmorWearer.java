public class MediumArmorWearer extends MartialWeaponWielder {
    public MediumArmorWearer(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void wearArmor() {
        System.out.println("I wear medium armor!");
    }
}
