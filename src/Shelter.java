import java.util.ArrayList;

public class Shelter {
    private String name;
    private String location;
    private ArrayList<Pet> pets;

    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }


}
