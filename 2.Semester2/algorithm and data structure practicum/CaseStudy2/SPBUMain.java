import java.util.Scanner;

public class SPBUMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VehicleQueue queue = new VehicleQueue();
        RefuelingTransaction[] history = new RefuelingTransaction[100];
        int historySize = 0;

        Gas[] fuels = {
                new Gas("Pertalite", 10000),
                new Gas("Pertamax", 14000)
        };

        boolean running = true;
        while (running) {
            System.out.println("\n=== Gas Station Menu ===");
            System.out.println("1. Add Vehicle to Queue");
            System.out.println("2. Display Vehicle Queue");
            System.out.println("3. Check Number of Vehicles in Queue");
            System.out.println("4. Serve Vehicle");
            System.out.println("5. Display Transaction History");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Licencse Plate: ");
                    String plate = input.nextLine();
                    System.out.print("Enter Vehicle Type: ");
                    String type = input.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = input.nextLine();
                    queue.enqueue(new Vehicle(plate, type, brand));
                    break;

                case 2:
                    queue.displayQueue();
                    break;

                case 3:
                    int count = queue.getSize();
                    System.out.println("Number of vehicles in queue: " + count);
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                        break;
                    }

                    Vehicle v = queue.dequeue();
                    System.out.println("Attendant is serving " + v.platenumber);

                    System.out.print("Enter Fuel Type: ");
                    String fuelName = input.nextLine();

                    Gas selectedFuel = null;
                    for (Gas f : fuels) {
                        if (f.gasName.equalsIgnoreCase(fuelName)) {
                            selectedFuel = f;
                            break;
                        }
                    }

                    if (selectedFuel == null) {
                        System.out.println("Fuel not available.");
                        break;
                    }

                    System.out.print("Enter Price per liter: ");
                    double price = input.nextDouble();
                    System.out.print("Enter Number of liters: ");
                    double liters = input.nextDouble();
                    input.nextLine();

                    double total = liters * price;
                    RefuelingTransaction rt = new RefuelingTransaction(v, new Gas(fuelName, price), liters, total);
                    history[historySize] = rt;
                    historySize++;

                    System.out.println(">> Transaction successfully recorded.\n");
                    break;

                case 5:
                    if (historySize == 0) {
                        System.out.println("No transactions yet.");
                    } else {
                        System.out.println("-- Transaction History --");
                        System.out.println("List of Transactions:");
                        for (int i = 0; i < historySize; i++) {
                            history[i].printTransaction();
                        }
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        input.close();
    }
}
