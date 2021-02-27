import java.util.Scanner;

public class PartnerLab1 {
    public static void main(String[] args) {
        Elevator e1 = new Elevator();
        Elevator e2 = new Elevator();
        e1.setWeightLimit(500);
        e2.setWeightLimit(800);
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            String name;
            int weight;
            System.out.println("Enter Name of Person: ");
            name = sc.next();
            System.out.println("Enter weight of Person: ");
            weight = sc.nextInt();
            if (count == 0) {
                if (e1.addPerson(name, weight)) {
                    System.out.println("Person Successfully added, " + name + " weighs = " + weight + "Lbs");
                } else {
                    System.out.println("Person could not be added");
                }

            } else {
                if (e2.addPerson(name, weight)) {
                    System.out.println("Person Successfully added , Name = " + name + " Weight = " + weight);
                } else {
                    System.out.println("Person could not be added");
                }
            }
            System.out.println("Do you want to quit?");
            char q = sc.next().charAt(0);
            if (q == 'q') {
                count++;
            }

        } while (count < 2);
        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
    }
}