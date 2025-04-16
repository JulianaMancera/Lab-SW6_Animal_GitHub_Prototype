class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
        this.name = "Cow";
    }

    @Override
    public Animal clone() {
        Cow cow = new Cow();
        cow.legs = this.legs;
        cow.sound = this.sound;
        cow.food = this.food;
        cow.name = this.name;
        return cow;
    }

    @Override
    public String makeSound() {
        return sound;
    }

    @Override
    public String getType() {
        return name;
    }

    public int getLegs() { return legs; }
    public String getFood() { return food; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; } // Added setter
}