public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Test Sheep
        Animal sheep = registry.createSheep("Dolly");
        System.out.println("Animal: " + sheep.getType() + ", Name: " + ((Sheep) sheep).getName() + 
                          ", Sound: " + sheep.makeSound() + ", Legs: " + ((Sheep) sheep).getLegs() + 
                          ", Food: " + ((Sheep) sheep).getFood());

        // Test Cow
        Animal cow = registry.createCow("Bessie");
        System.out.println("Animal: " + cow.getType() + ", Name: " + ((Cow) cow).getName() + 
                          ", Sound: " + cow.makeSound() + ", Legs: " + ((Cow) cow).getLegs() + 
                          ", Food: " + ((Cow) cow).getFood());

        // Test Horse
        Animal horse = registry.createHorse("Spirit");
        System.out.println("Animal: " + horse.getType() + ", Name: " + ((Horse) horse).getName() + 
                          ", Sound: " + horse.makeSound() + ", Legs: " + ((Horse) horse).getLegs() + 
                          ", Food: " + ((Horse) horse).getFood() + ", Color: " + ((Horse) horse).getColor());
    }
}