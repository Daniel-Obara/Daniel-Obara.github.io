import java.util.List;

public class Student extends Person {

   private String id;

   private String major;

   private double gpa;
   
   public Student(String firstName, String lastName, int age, String homeTown, List<Address> address, String id,

   String major, double gpa) {

   super(firstName, lastName, age, homeTown, address);

   this.id = id;

   this.major = major;

   this.gpa = gpa;

   }

   
   public String getId() {

   return id;

   }



   public void setId(String id) {

   this.id = id;

   }

  

   public String getMajor() {

   return major;

   }


   public void setMajor(String major) {

   this.major = major;

   }


   public double getGpa() {

   return gpa;

   }


   public void setGpa(double gpa) {

   this.gpa = gpa;

   }

   @Override

   public String toString() {

   return super.toString() + "\nThe Studnet ID is " + id + ", The Major is " + major + "and their GPA is " + gpa;

   }

   }