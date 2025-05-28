public class VehicleQueue {
    Node front, rear;

    public void enqueue(Vehicle vehicle) {
        Node newNode = new Node(vehicle);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Vehicle added to the queue.");
    }

    public Vehicle dequeue() {
        if (front == null) {
            System.out.println("No vehicles in the queue.");
            return null;
        }
        Vehicle vehicle = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return vehicle;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Current vehicle queue:");
        Node current = front;
        while (current != null) {
            current.data.ShowInformation();
            System.out.println("-------");
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}