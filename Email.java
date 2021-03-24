import java.util.*;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int defaultpasswordlength=10;
    private int mailboxcapacity=500;
    private String alternateemail;
    private String companysuffix="ayecompany.com";

    //CONSTRUCTOR TO RECEIVE THE FIRSTNAME AND LASTNAME
    public Email(String firstname, String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;

        //CALL A METHOD ASKING FOR THE DEPARTMENT 
        this.department=setDepartment();

        //CALL A METHOD THAT RETURNS A RANDOM PASSWORD
        this.password=randomPassword(defaultpasswordlength);
        

        //COMBINE ELEMENTS TO GENERATE EMAIL
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+"."+companysuffix;

    }

    //ASK FOR THE DEPARTMENT
    private String setDepartment()
    {
        System.out.println("DEPARTMENT CODES\n1 For Sales\n2 For Development\n3 For Accounting\n4 For none\nEnter department code : ");
        Scanner dc= new Scanner(System.in);
        int depchoice=dc.nextInt();
        if (depchoice==1) {return "Sales";}
        else if (depchoice==2) {return "Development";}
        else if (depchoice==3) {return "Accounting";}
        else if (depchoice==4) {return "Secondarystaff";}
        else { System.out.println("Wrong choice! Please select correct option.");
        return setDepartment();}
    }
    //GENERATE RANDOM PASSWORD
    private String randomPassword(int length)
    {
        String passwordset= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890#@$%!&";
        char[] password=new char[length];
        for(int i=0;i<length;i++)
        {
            int rand=(int)(Math.random() * passwordset.length());
            password [i]=passwordset.charAt(rand);
        }return new String(password);
    }
    //SET THE MAILBOX CAPACITY
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxcapacity=capacity;
    }
    //SET THE ALTERNATE EMAIL
    public void setAlternateEmail(String altemail)
    {
        this.alternateemail=altemail;
    }
    //CHANGE THE PASSWORD
    public void changePassword(String password)
    {
        this.password=password;
    }
    //PUBLIC METHODS ACCESSING THE PROPERTIES
    public int getMailboxCapacity()
    {
        return mailboxcapacity;
    }
    public String getAlternateEmail()
    {
        return alternateemail;
    }
    
    public String showInfo()
    {
        return "\nDisplay name : "+firstname+" "+lastname+"\nCompany email : "+email+"\nCompany password : "
        +password+"\nMailbox capacity : "+mailboxcapacity+"mb";
    }

}
