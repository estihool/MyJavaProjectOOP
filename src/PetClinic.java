import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PetClinic {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Buddy", 3, "Labrador"));
        pets.add(new Cat("Misty", 2, "White"));
        pets.add(new Dog("Charlie", 5, "Beagle"));
        pets.add(new Cat("Luna", 1, "Black"));

        // יצירת רשימה של ווטרינרים
        List<Veterinarian> vets = new ArrayList<>();
        vets.add(new GeneralVeterinarian("Dr. Cohen"));
        vets.add(new SpecialistVeterinarian("Dr. Levi", "Skin"));

        // הדגמת בדיקה של כל חיה על ידי כל ווטרינר
        System.out.println("=== Pet Examinations ===");
        for (Veterinarian vet : vets) {
            for (Pet pet : pets) {
                System.out.println(vet.getName() + " examines " + pet.getName() + ": " + vet.examinePet(pet));
            }
        }

        // הדגמת צלילים ואוכל של חיות המחמד
        System.out.println("\n=== Pet Sounds and Food ===");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " (" + pet.getSpecies() + ") says: " + pet.makeSound()+
               ",Age: "+ pet.getAge());

      // אם זו חיה מסוג כלב
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet; // המרה לכלב כדי לגשת ל־breed
                System.out.print(", Breed: " + dog.getBreed());
            }

            // אם זו חיה מסוג חתול
            if (pet instanceof Cat) {
                Cat cat = (Cat) pet; // המרה לחתול כדי לגשת ל־color
                System.out.print(", Color: " + cat.getColor());
            }
            System.out.println();
            System.out.println(pet.getName() + " eats: " + pet.eat());
        }









        // עשיתי ToString במחלקות היורשות
        // System.out.println(pet);

    }

}
