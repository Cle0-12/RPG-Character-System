public class Warrior extends GameCharacter implements Defendable {
    private int armorRating;

    public Warrior(String name, int hp, int attackPower, int armorRating) {
        super(name, hp, attackPower);
        this.armorRating = armorRating;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " swings a heavy sword for " + getAttackPower() + " damage!");
    }

    @Override
    public String describeClass() {
        return "Warrior: A melee specialist with " + armorRating + " armor.";
    }

    @Override
    public void block() {
        System.out.println(getName() + " raises a shield to block incoming damage!");
    }

    @Override
    public int getDefenseRating() { return armorRating; }
}