class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;
    private String name;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Brown";
        this.name = "Horse";
    }

    @Override
    public Animal clone() {
        Horse horse = new Horse();
        horse.legs = this.legs;
        horse.sound = this.sound;
        horse.food = this.food;
        horse.color = this.color;
        horse.name = this.name;
        return horse;
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
    public String getColor() { return color; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; } // Added setter
}