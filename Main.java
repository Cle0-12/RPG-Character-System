import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Create party members
        ArrayList<GameCharacter> party = new ArrayList<>();
        party.add(new Warrior("Aldric", 120, 18, 25));
        party.add(new Mage("Elara", 70, 30, 100));
        party.add(new Archer("Kael", 85, 22, 30));

        // 2. Polymorphic loop
        System.out.println("=== PARTY ROSTER & ACTIONS ===");
        int totalHP = 0;
        int casterCount = 0;

        for (GameCharacter c : party) {
            System.out.println(c.describeClass());
            c.attack();
            c.rest(); // Concrete method from abstract parent
            totalHP += c.getHp();
            
            if (c instanceof CasterAbility) casterCount++;
            System.out.println("-------------------------");
        }

        // 3. Interface-specific actions via instanceof and Downcasting
        System.out.println("\n=== SPECIAL ABILITIES ===");
        for (GameCharacter c : party) {
            if (c instanceof CasterAbility) {
                CasterAbility caster = (CasterAbility) c; // Downcast
                caster.castSpell("Fireball");
            } 
            if (c instanceof Defendable) {
                Defendable defender = (Defendable) c; // Downcast
                defender.block();
            }
        }

        // 4. Summary report
        System.out.println("\n=== PARTY SUMMARY ===");
        System.out.println("Total Party Size: " + party.size());
        System.out.println("Total Party HP: " + totalHP);
        System.out.println("Casters: " + casterCount + " | Non-Casters: " + (party.size() - casterCount));
        System.out.println("Ready Status: Active and Prepared.");
    }
}