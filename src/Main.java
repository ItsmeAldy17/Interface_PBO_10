public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword("Vandal", "S", 2900, 150);
        Shield shield = new Shield("Heavy Shield", "S", 3500, 160);
        Potion healPotion = new Potion("Med Kit", "A", 2000, 5, 20, "heal");
        Potion attackPotion = new Potion("Physical Potion", "A", 2300, 15, 40, "attack");

        sword.use();
        healPotion.use();
        attackPotion.use();
        shield.use();
    }
}
