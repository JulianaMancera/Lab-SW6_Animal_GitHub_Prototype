class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = "Sheep";
    }

    @Override
    public Animal clone() {
        Sheep sheep = new Sheep();
        sheep.legs = this.legs;
        sheep.sound = this.sound;
        sheep.food = this.food;
        sheep.name = this.name;
        return sheep;
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