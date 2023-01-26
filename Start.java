public class Start {
    public Start() {
    }
    public static void main(String[] args) {
        Animal animal = new Animal("Leone ");
        animal.animalSound();
        animal.animalSound("high");
        animal.animalSound("low");
        animal.animalSound("medium");
    }
}


