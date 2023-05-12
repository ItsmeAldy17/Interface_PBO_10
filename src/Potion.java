public class Potion extends Item implements ActionInterface {
    private final int duration;
    private final int effect_point;
    private final String type;

    public int getDuration() {
        return duration;
    }

    public int getEffect_point() {
        return effect_point;
    }

    public String getType() {
        return type;
    }

    @Override
    public void use() {
        if (this.type.equalsIgnoreCase("attack")) {
            System.out.println("Damage dealt by " + this.effect_point);
        } else if (this.type.equalsIgnoreCase("heal")) {
            System.out.println("Healed by " + this.effect_point);
        }
    }

    public Potion(String nama, String rank, int price, int duration, int effect_point, String type) {
        super(nama, rank, price);
        this.duration = duration;
        this.effect_point = effect_point;
        this.type = type;
    }
}