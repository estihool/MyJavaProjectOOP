// ווטרינר מומחה שמיישם את הממשק
public class SpecialistVeterinarian implements Veterinarian {
    private String name;
    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist (" + specialty + ") check for " + pet.getName();
    }
}
