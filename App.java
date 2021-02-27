
import java.util.ArrayList;

import java.util.List;


public class App {

   public static void main(String[] args) {

   

   List<Address> address = new ArrayList<Address>();

   address.add(new Address("340 east beaver ave", "State College", "Pennsylvania", 16801, AddressType.LOCAL));

   address.add(new Address("218 Spruce Run Dr.", "Dingmans Ferry", "Pennslyvania", 18328, AddressType.PERMANENT));

   

   Person p1 = new Student("Daniel", "Obara", 19, "State College", address, "101", "ETI", 3.02);

   

   List<Address> address1 = new ArrayList<Address>();

   address1.add(new Address("612 Stuart Hall", "State College", "Pennsylvania", 16802, AddressType.LOCAL));

   address1.add(new Address("101 street", "North Aleghany", "Pennsylvania", 101001, AddressType.PERMANENT));

   

   Person p2 = new StudentAthlete("Amir", "Zisling", 20, "State College", address1, "102", "Education", 4.0, "Flag Football");

   

   System.out.println("Person 1 details: ");

   System.out.println(p1.toString());

   System.out.println("\nPerson 2 details: ");

   System.out.println(p2.toString());

   }

   }