public class Main {
    public static void main(String[] args) {
        // Create Shelter
        Shelter shelter = new Shelter("Happy Tails", "123 Main St");

        // Add Pets
        shelter.addPet1(new Pet("Bella", "Dog", 3));
        shelter.addPet2(new Pet("Milo", "Cat", 2));
        shelter.addPet3(new Pet("Max", "Dog", 5));

        // Display All Pets
        System.out.println("All Pets in Shelter:");
        shelter.displayPets();

        // Filter by Type
        shelter.filterByType("Dog");

        // Search by Name
        shelter.searchByName("Milo");

        // Display Shelter Information
        System.out.println("Shelter Details: " + shelter);
    }
}
