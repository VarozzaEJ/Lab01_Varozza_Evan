public class Adventure {
    public static void main(String[] args) {
        Knight knight = new Knight(17, 17, "heavy", "martial");
        Barbarian barbarian = new Barbarian(21, 13, "medium", "martial");
        Ranger ranger = new Ranger(13, 15, "medium", "martial");
        Rogue rogue = new Rogue(11, 16, "light", "simple");
        Cleric cleric = new Cleric(14, 17, "medium", "simple");
        Wizard wizard = new Wizard(9, 10, "none", "staff");
        
        System.out.println(knight.toString());;
        knight.wearArmor();
        knight.useWeapon();
        knight.hasManeuvers();
        System.out.println();
        
        System.out.println(barbarian.toString());;
        barbarian.wearArmor();
        barbarian.useWeapon();
        barbarian.tendsToRage();
        System.out.println();

        System.out.println(ranger.toString());;
        ranger.wearArmor();
        ranger.useWeapon();
        ranger.sneaksAround();
        ranger.willToSurvive();
        System.out.println();

        System.out.println(rogue.toString());;
        rogue.wearArmor();
        rogue.useWeapon();
        rogue.sneaksAround();
        rogue.picksLock();
        System.out.println();

        System.out.println(cleric.toString());;
        cleric.wearArmor();
        cleric.useWeapon();
        cleric.castsSpell();
        cleric.healsOthers();
        System.out.println();

        System.out.println(wizard.toString());;
        wizard.wearArmor();
        wizard.useWeapon();
        wizard.castsSpell();
        wizard.solvesProblems();
        System.out.println();
    }


}