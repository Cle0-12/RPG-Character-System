/**
 * Abstract base class for all RPG characters.
 * Defines shared attributes and the core contract for character behavior.
 */
public abstract class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    /**
     * Concrete method: Restores health to the character.
     */
    public void rest() {
        this.hp += 10;
        System.out.println(name + " rests and recovers 10 HP.");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void attack();
    public abstract String describeClass();

    // Getters and Setters
    public String getName() { return name; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public int getAttackPower() { return attackPower; }
}