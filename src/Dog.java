public class Dog extends Pet{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }

    public  String getBreed(){
        return breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Dog food";
    }

    @Override
    public String toString() {
        return getName() + " (" + getSpecies() + "), Age: " + getAge() +
                ", Breed: " + breed +
                ", Sound: " + makeSound() +
                ", Eats: " + eat();
    }

}
