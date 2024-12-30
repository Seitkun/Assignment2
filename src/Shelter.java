import java.util.Objects;

public class Shelter {
    private String name;
    private String location;

    private Pet pet1;
    private Pet pet2;
    private Pet pet3;

    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Add pets manually
    public void addPet1(Pet pet) {
        this.pet1 = pet;
    }

    public void addPet2(Pet pet) {
        this.pet2 = pet;
    }

    public void addPet3(Pet pet) {
        this.pet3 = pet;
    }

    // Display all pets in the shelter
    public void displayPets() {
        if (pet1 != null) System.out.println(pet1);
        if (pet2 != null) System.out.println(pet2);
        if (pet3 != null) System.out.println(pet3);
    }

    // Filter pets by type (manual comparison)
    public void filterByType(String type) {
        System.out.println("Filtered pets by type '" + type + "':");
        if (pet1 != null && type.equalsIgnoreCase(pet1.getType())) System.out.println(pet1);
        if (pet2 != null && type.equalsIgnoreCase(pet2.getType())) System.out.println(pet2);
        if (pet3 != null && type.equalsIgnoreCase(pet3.getType())) System.out.println(pet3);
    }

    // Search pet by name
    public void searchByName(String name) {
        System.out.println("Search results for pet name '" + name + "':");
        if (pet1 != null && name.equalsIgnoreCase(pet1.getName())) System.out.println(pet1);
        if (pet2 != null && name.equalsIgnoreCase(pet2.getName())) System.out.println(pet2);
        if (pet3 != null && name.equalsIgnoreCase(pet3.getName())) System.out.println(pet3);
    }

    @Override
    public String toString() {
        return "Shelter{name='" + name + "', location='" + location + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
