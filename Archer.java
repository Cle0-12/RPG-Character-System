public class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int hp, int attackPower, int arrowCount) {
        super(name, hp, attackPower);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " shoots an arrow! Arrows left: " + arrowCount);
        } else {
            System.out.println(getName() + " is out of arrows and stabs with a knife!");
        }
    }

    @Override
    public String describeClass() {
        return "Archer: A ranged combatant with " + arrowCount + " arrows.";
    }
}