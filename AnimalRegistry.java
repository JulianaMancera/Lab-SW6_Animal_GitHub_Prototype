public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        this.sheepPrototype = new Sheep();
        this.cowPrototype = new Cow();
        this.horsePrototype = new Horse();
    }

    public Animal createSheep(String name) {
        Animal sheep = sheepPrototype.clone();
        ((Sheep) sheep).name = name;
        return sheep;
    }

    public Animal createCow(String name) {
        Animal cow = cowPrototype.clone();
        ((Cow) cow).name = name;
        return cow;
    }

    public Animal createHorse(String name) {
        Animal horse = horsePrototype.clone();
        ((Horse) horse).name = name;
        return horse;
    }
}