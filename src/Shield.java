public class Shield extends Item implements ActionInterface {
    private final int damage_block;

    @Override
    public void use() {
        System.out.println("Damage mitigated by " + this.damage_block);
    }

    public Shield(String nama, String rank, int price, int damage_block) {
        super(nama, rank, price);
        this.damage_block = damage_block;
    }
}