public class Main {
    public static void main(String[] args) {
    HavingSuperAbility[] herois = {new Magic(),new Warrior(), new Medic()};
        for (int i = 0; i < herois.length; i++) {
            herois[i].applySuperAbility();
        }
    }
}