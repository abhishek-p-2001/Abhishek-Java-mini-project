import java.util.*;
@SuppressWarnings("java:536871799");
public class EmailApp {
    public static void main(String[] args) {
        
        Scanner name= new Scanner(System.in);
        System.out.print("Enter firstname : ");  
        String fname= name.nextLine();
        
        System.out.print("Enter lastname : ");  
        String lname= name.nextLine();
        Email em1= new Email (fname,lname);
        
        System.out.println(em1.showInfo());

        em1.setAlternateEmail(lname.toLowerCase()+"."+fname.toLowerCase()+"@ayecompany.com");
        System.out.println("Alternate email ID : "+em1.getAlternateEmail());

        em1.setMailboxCapacity(400);
        System.out.println("Alternate mailbox capacity : "+em1.getMailboxCapacity()+"mb");

    }
}
