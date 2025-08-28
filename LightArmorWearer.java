public class LightArmorWearer extends SimpleWeaponWielder {
    public LightArmorWearer(int hitPoints, int armorClass, String armorType, String weaponType) {
        super(hitPoints, armorClass, armorType, weaponType);
    }

    public void wearArmor() {
        System.out.println("I wear light armor!");
    }
}
