public class Mage extends GameCharacter implements CasterAbility {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " fires a magic missile!");
    }

    @Override
    public String describeClass() {
        return "Mage: A powerful spellcaster with " + mana + " mana.";
    }

    @Override
    public void castSpell(String spellName) {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(getName() + " casts " + spellName + "!");
        } else {
            System.out.println(getName() + " is out of mana!");
        }
    }

    @Override
    public int getMana() { return mana; }
}