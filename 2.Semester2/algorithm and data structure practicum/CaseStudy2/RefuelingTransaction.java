public class RefuelingTransaction {
    Vehicle vehicle;
    Gas gas;
    double liter, paymenttotal;

    public RefuelingTransaction(Vehicle vc, Gas gs, double lt, double pt) {
        this.vehicle = vc;
        this.gas = gs;
        this.liter = lt;
        this.paymenttotal = pt;
    }

    public void printTransaction() {
        System.out.println(vehicle.platenumber + ": Rp " + paymenttotal);
    }
}
