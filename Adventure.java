public class Adventure {
    public static void main(String[] args) {
        Knight Knight = new Knight(10, 15, "heavy", "martial");
        
        System.out.println(Knight.toString());;
        Knight.wearArmor();
        Knight.useWeapon();
        Knight.hasManeuvers();
    }


}