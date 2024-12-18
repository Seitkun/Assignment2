import java.util.ArrayList;

public class Shelter {
    private String name;
    private String location;
    private ArrayList<Pet> pets;

    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void listPets() {
        System.out.println("Shelter Name: " + name + " Location: " + location);
        for (Pet pet : pets) {
            pet.displayPetDetails();
        }
    }
}
