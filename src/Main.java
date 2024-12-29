public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Sharik", "Dog", 3);
        Pet pet2 = new Pet("Kuki", "Cat", 5);

        Adopter adopter = new Adopter("Stepa", "stepa123@gmail.com");

        Shelter shelter = new Shelter("Shelter", "ShelterAY, GreenHills, 173");
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        System.out.println(pet1.getName() + " " + pet1.getType() + " " + pet1.getAge());

        System.out.println(pet2.getName() + " " + pet2.getType() + " " +  pet2.getAge());

        adopter.displayAdopterDetails();

        if (pet1.getAge() > pet2.getAge()) {
            System.out.println(pet1.getName() + " is older than " + pet2.getName());
        } else {
            System.out.println(pet2.getName() + " is older than " + pet1.getAge());
        }
    }
}