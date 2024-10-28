import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Scanner;   

// Class to manage appointments
class AppointmentSystem {
    // HashMap to store dermatologists and their appointments
    private HashMap<String, ArrayList<String>> dermatologists;

    public AppointmentSystem() {
        dermatologists = new HashMap<>();
    }

    // Method to add a dermatologist
    public void addDermatologist(String name) {
        dermatologists.put(name, new ArrayList<>());
    }

    // Method to book an appointment
    public void bookAppointment(String dermatologist, String time) {
        // Check if the dermatologist exists
        if (!dermatologists.containsKey(dermatologist)) {
            System.out.println("Dermatologist not found.");
            return;
        }

        ArrayList<String> appointments = dermatologists.get(dermatologist);

        // Check if the time is already booked
        if (appointments.contains(time)) {
            System.out.println("The time " + time + " is unavailable.");
        } else {
            appointments.add(time);
            System.out.println("Appointment booked for " + dermatologist + " at " + time + ".");
        }
    }

    // Method to display appointments for a dermatologist
    public void displayAppointments(String dermatologist) {
        if (dermatologists.containsKey(dermatologist)) {
            ArrayList<String> appointments = dermatologists.get(dermatologist);
            System.out.println("Appointments for " + dermatologist + ": " + appointments);
        } else {
            System.out.println("Dermatologist not found.");
        }
    }
}

// Main class
public class ClinicAppointment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentSystem system = new AppointmentSystem();

        // Add some dermatologists
        system.addDermatologist("Dr. Smith");
        system.addDermatologist("Dr. Johnson");

        while (true) {
            System.out.println("1. Book an Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter dermatologist name: ");
                    String dermatologist = scanner.nextLine();
                    System.out.print("Enter appointment time (e.g., 10:00 AM): ");
                    String time = scanner.nextLine();
                    system.bookAppointment(dermatologist, time);
                    break;
                case 2:
                    System.out.print("Enter dermatologist name: ");
                    dermatologist = scanner.nextLine();
                    system.displayAppointments(dermatologist);
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
