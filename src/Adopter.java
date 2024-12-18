public class Adopter {
    private String name;
    private String contactInfo;

    public Adopter(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void displayAdopterDetails(){
        System.out.println("Adopter Name: " + name + ", Contact Info: " + contactInfo);
    }
}
