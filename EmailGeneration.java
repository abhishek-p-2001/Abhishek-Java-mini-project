import javax.swing.*;  
import java.awt.event.*;  
public class EmailGeneration extends JFrame implements ActionListener{  
    JLabel l,m,n;  
    JTextField a,c;
    JCheckBox cb1,cb2,cb3,cb4;  
    JButton b;
    private ButtonGroup checkBoxGroup; 
    private String companysuffix="ayecompany.com";
    private String department="";
    
    //private int mailboxcapacity=500; 

    EmailGeneration(){  
        setTitle("EMAIL GENERATION 2021");
        
        l=new JLabel("Enter firstname : ");  
        l.setBounds(20,10,100,20);
        a= new JTextField();
        a.setBounds(150,10,100,20);
        add(a);
        

        m=new JLabel("Enter lastname : ");  
        m.setBounds(20,50,100,20);
        c= new JTextField();
        c.setBounds(150,50,100,20);
        add(c);

        n=new JLabel("Select department");  
        n.setBounds(20,90,200,20);  
        cb1=new JCheckBox("Sales");  
        cb1.setBounds(100,130,150,20);  
        cb2=new JCheckBox("Development");  
        cb2.setBounds(100,160,150,20);  
        cb3=new JCheckBox("Accounting");  
        cb3.setBounds(100,190,150,20);
        cb4=new JCheckBox("Secondary Staff");  
        cb4.setBounds(100,220,150,20); 
        
        checkBoxGroup = new ButtonGroup();
        //checkbox ko button group me add kar diya
        checkBoxGroup.add(cb1);
        checkBoxGroup.add(cb2);
        checkBoxGroup.add(cb3);
        checkBoxGroup.add(cb4);
        
        b=new JButton("Generate");  
        b.setBounds(100,280,90,30);  
        b.addActionListener(this);  
        add(l);add(m);add(n);add(cb1);add(cb2);add(cb3);add(cb4);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    
    public void actionPerformed(ActionEvent e){  
        
        String msg="";
        String pass="";
        String em="";  
        if(cb1.isSelected()){  
            msg="You are in ";  
            department="Sales";
            pass=randomPassword();
            em=randomEmail();
        }  
        else if(cb2.isSelected()){  
            msg="You are in ";  
            department="Development";
            pass=randomPassword();
            em=randomEmail();
        }  
        else if(cb3.isSelected()){  
            msg="You are in ";  
            department="Accounting";
            pass=randomPassword();
            em=randomEmail();
        }
        else
        {
            msg="You are in ";  
            department="Secondary";
            pass=randomPassword();
            em=randomEmail();
        }  

        JOptionPane.showMessageDialog(this,msg+department+"\nPassword : "+pass+"\nEmail : "+em);
    }  

    public String randomPassword()
    {
        int length=10;
        String passwordset= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890#@$%!&";
        char[] password=new char[length];
        for(int i=0;i<length;i++)
        {
            int rand=(int)(Math.random() * passwordset.length());
            password [i]=passwordset.charAt(rand);
        }return new String(password);
    }

    public String randomEmail()
    {
        String email;
        email=department.toLowerCase()+"."+companysuffix;
        return email;
    }
    public static void main(String[] args) {  
        new EmailGeneration();

    }  
}