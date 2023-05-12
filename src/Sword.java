public class Sword extends Item implements ActionInterface {
    private final int damage;

    @Override
    public void use() {
        System.out.println("Damage dealt by " + this.damage);
    }

    public Sword(String nama, String rank, int price, int damage) {
        super(nama, rank, price);
        this.damage = damage;
    }
}