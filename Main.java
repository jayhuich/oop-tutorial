public class Main {

    public static void printCharInfo(Character character) {
        System.out.println("=== CURRENT STATS ===");
        System.out.println("Name: " + character.getName() + " - " + character.getAlignment());
        System.out.println("Health: " + character.getHealth() + "/" + character.getMaxHealth());
        System.out.println("=====================");
        System.out.println();
    }

    public static void damage(Character character, int health) {
        character.modifyHealth(-health);
        System.out.println("10 damage dealt to " + character.getName() + "!");
        System.out.println();
    }

    public static void heal(Character character, int health) {
        character.modifyHealth(health);
        System.out.println(character.getName() + " healed 20 HP!");
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("World initialized!");

        Character myChar = new Character("daniel", 100);
        printCharInfo(myChar);
        damage(myChar, 10);
        printCharInfo(myChar);
        heal(myChar, 20);
        printCharInfo(myChar);

    }
}
