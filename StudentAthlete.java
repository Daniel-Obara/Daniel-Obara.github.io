import java.util.List;

import java.util.Random;


public class StudentAthlete extends Student{

   

   private String sports;

   private int ranking;

  

   public StudentAthlete(String firstName, String lastName, int age, String homeTown, List<Address> address, String id,

           String major, double gpa, String sports) {

       super(firstName, lastName, age, homeTown, address, id, major, gpa);

       this.sports = sports;

       this.ranking = new Random().nextInt(100);

   }

  

   public String getSports() {

       return sports;

   }

  

   public void setSports(String sports) {

       this.sports = sports;

   }

  

   public int getRanking() {

       return ranking;

   }

   

   public void setRanking(int ranking) {

       this.ranking = ranking;

   }

  
   @Override

   public String toString() {

       return super.toString() + "\nSports: " + sports + "\nRanking: " + ranking;

   }

}