public class Vehicle {
    String platenumber, type, brand;

    public Vehicle() {
    }

    public Vehicle(String pn, String tp, String br) {
        platenumber = pn;
        type = tp;
        brand = br;
    }

    void ShowInformation() {
        System.out.println("Plate number: " + platenumber);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }
}
