public class Animal {
    private String animalName;

    public Animal(String animalName) {this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println(this.animalName + " fa Roarrrrr");
    }

    public void animalSound(String intensity) {
        String result = this.animalName + "fa: ";
        switch (intensity) {
            case "high":
                result = result + "Roarrrrrrr";
                break;
            case "low":
                result = result + "Roar";
                break;
            default:
                result = result + "Cannot reproduce it properly";
        }

        System.out.println(result);
    }
}


