import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * App
 */
public class App {

    public static String groomName()
    {
        String groomName = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Groom's Name: " );
        groomName = scan.nextLine();
        return groomName;
    }
    public static String brideName()
    {
        String brideName = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Bride's Name: " );
        brideName = scan.nextLine();
        return brideName;
    }
    public static int numbOfGuests()
    {
        int numbOfGuests = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Number of Guests: " );
        numbOfGuests = scan.nextInt();
        return numbOfGuests;
    }
    public static double sqFt()
    {
        double sqFt = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Square Footage of the room: " );
        sqFt = scan.nextInt();
        return sqFt;
    }
    public static ArrayList songNames()
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> songs = new ArrayList<>();
        String songRec = "";
        String response = "";
        boolean done = false;
    while(done == false)
    {
System.out.println("What song would you like to listen to?");
songRec = scan.nextLine();
songs.add(songRec);
System.out.println("are you done?");
response = scan.nextLine();
if(response.equalsIgnoreCase("yes"))
{
done = true;
System.out.println("Song Request Completed");
}

}
        return songs;

        }
    
        public static double guestPerSqFt(int numbOfGuests, double sqFt)
        {
            double guestPerSqFt = 0;
            guestPerSqFt = numbOfGuests/sqFt;
            return guestPerSqFt;
        }
    
    public static void main(String[] args) throws Exception {
       String groomName = groomName();
       String brideName = brideName();
       int numbOfGuests = numbOfGuests();
       double sqFt = sqFt();
      ArrayList<String> songs = songNames();
       double guestPerSqFt = guestPerSqFt(numbOfGuests, sqFt);

       try
       {
           PrintWriter pw = new PrintWriter("assignment_1_wedding.txt");
           pw.println(groomName);
           pw.println(brideName);
           pw.println(numbOfGuests);
           pw.println(sqFt);
          pw.println(songs);
           pw.println(guestPerSqFt);
           pw.close();

        Scanner fileScan = new Scanner(new File("assignment_1_wedding.txt"));
        while(fileScan.hasNextLine());
        {
            System.out.println(fileScan.nextLine());
        }
       
       }

        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}