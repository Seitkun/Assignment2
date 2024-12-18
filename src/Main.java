public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Sharik", "Dog", 3);
        Pet pet2 = new Pet("Kuki", "Cat", 5);

        Adopter adopter = new Adopter("Stepa", "stepa123@gmail.com");

        Shelter shelter = new Shelter("Shelter", "shelter123@gmail.com");
        shelter.addPet(pet1);
        shelter.addPet(pet2);

        shelter.listPets();

        adopter.displayAdopterDetails();

        if (pet1.getAge() > pet2.getAge()) {
            System.out.println(pet1.getName() + " is older than " + pet2.getName());
        } else {
            System.out.println(pet2.getName() + " is older than " + pet1.getAge());
        }
    }
}