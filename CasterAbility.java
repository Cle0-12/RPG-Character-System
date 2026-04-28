/**
 * Interface for characters capable of using magic.
 */
public interface CasterAbility {
    /**
     * Performs a magical spell.
     * @param spellName The name of the spell to cast.
     */
    void castSpell(String spellName);
    
    /**
     * Retrieves the current mana of the caster.
     * @return The amount of mana remaining.
     */
    int getMana();
}