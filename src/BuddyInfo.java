public class BuddyInfo {

    private String name;

    private String address;

    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println(name + "\n" + "Hello");
    }
    public String getName() {

        return name;
    }
    public String getAddress() {

        return address;
    }
    public int getNumber() {

        return phoneNumber;
    }

    public static void main(String[] args) {

        BuddyInfo buddyinfo = new BuddyInfo("Homer", "Aylmer", 6138889);

        System.out.println("Hello World!");

    }

}
