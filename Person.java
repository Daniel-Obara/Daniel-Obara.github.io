

import java.util.ArrayList;

import java.util.List;


public class Person {

   private String givenName;

   private String familyName;

   private int age;

   private String homeTown;

   private List<Address> addresses;


public Person() {

       this.givenName = "";

       this.familyName = "";

       this.age = 0;

       this.homeTown = "";

       this.addresses = new ArrayList<Address>();

   }

  
   public Person(String givenName, String familyName, int age, String homeTown, List<Address> addresses) {

       this.givenName = givenName;

       this.familyName = familyName;

       this.age = age;

       this.homeTown = homeTown;

       this.addresses = addresses;

   }

   public String getGivenName() {

       return givenName;

   }

   public void setGivenName(String givenName) {

       this.givenName = givenName;

   }

   public String getFamilyName() {

       return familyName;

   }

   public void setFamilyName(String familyName) {

       this.familyName = familyName;

   }

   public int getAge() {

       return age;

   }

   public void setAge(int age) {

       this.age = age;

   }

   public String getHomeTown() {

       return homeTown;

   }

   public void setHomeTown(String homeTown) {

       this.homeTown = homeTown;

   }

   public List<Address> getAddresses() {

       return addresses;

   }

   public void setAddresses(List<Address> addresses) {

       this.addresses = addresses;

   }

   @Override

   public String toString() {

   String s = "";

   for (Address address2 : addresses) {

   s += address2 + "\t";

   }

   return givenName + " " + familyName + " is "  + age + " Years Old, is from " + homeTown + ", Currently lives at "

   + s;

   }

}