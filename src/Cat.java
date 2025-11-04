public class Cat extends Pet{
    private String color;

    public Cat(String name,int age,String color){
        super(name,age,"cat");
        this.color=color;
    }

    public String getColor(){
        return color;
    }
    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Cat food";
    }

    @Override
    public String toString() {
        return getName() + " (" + getSpecies() + "), Age: " + getAge() +
                ", Color: " + color +
                ", Sound: " + makeSound() +
                ", Eats: " + eat();
    }

}
