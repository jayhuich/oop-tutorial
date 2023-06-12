public class Character {

    public enum CharAlignment {
        NEUTRAL,
        GOOD,
        EVIL;
    }

    private String name;
    private int health;
    private int maxHealth;
    private CharAlignment alignment;

    // default constructor
    public Character() {
        this.name = "Default";
        this.health = 100;
        this.maxHealth = 100;
        this.alignment = CharAlignment.NEUTRAL;
    }

    // constructor with parameters
    public Character(String name, int maxHealth) {
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.alignment = CharAlignment.NEUTRAL;
    }

    // getter function for name
    public String getName() {
        return name;
    }

    // setter function for name
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public boolean modifyHealth(int amount) {
        // deny health modification if character is dead
        if (health <= 0)
            return false;
        // prevent overheal
        if (health + amount > maxHealth)
            health = maxHealth;
        else
            health += amount;
        return true;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public CharAlignment getAlignment() {
        return alignment;
    }
}