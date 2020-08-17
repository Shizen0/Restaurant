package lokanta;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



  class Data{{
	/*ArrayList<String> IdList=new ArrayList<String>();  
	ArrayList<String> PassList=new ArrayList<String>();  
	
	public  void addPerson(String ID, String Pass) {
		
		IdList.add(ID);
		PassList.add(Pass);
		for(int i=0;i<(IdList.size());i++) {
			System.out.println(IdList.get(i));
			System.out.println(PassList.get(i));
			
			
		}
		
	}*/
	  try {
		  File file = new File("C:\\Users\\GARAJ\\Desktop\\Yemek.txt");
		  Scanner text = new Scanner(file); 
		  while (text.hasNextLine()) {
		        String data = text.nextLine();
		        System.out.println(data);
		      }
		  
	  }
	  catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 
	  
	  
	  
	  
  }
 
 
 
class MyFrame extends JFrame
{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel label;
  JLabel label1;
  JTextArea ID;
  JPasswordField Pass;
  JButton Signup;
  JButton Login;
 
  MyFrame( String title )
  {
    super( title );                      
    setSize( 1920, 1080 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setLayout(new GridLayout(3,1,20,20));   	
    
    label = new JLabel("ID",SwingConstants.CENTER);  
    label1 = new JLabel("Password", SwingConstants.CENTER);
    ID = new JTextArea();
    Pass = new JPasswordField();
    Signup= new JButton("SIGNUP");
    Signup.addActionListener(new ActionListener()
    {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			//SignUp signup = new SignUp("SignUp"); 
			//signup.setVisible( true );
			
		}
    	});
    Login= new JButton("LOGIN");
    
    add( label );  
    add(ID);
    add( label1 );  
    add(Pass);
    add(Signup);
    add(Login);
  }
} 


 /*class SignUp extends JFrame
{
	JLabel ID;
	JLabel Pass;
	JLabel PassConfirm;
	JTextArea IDt;
	JPasswordField Passt;
	JPasswordField PassConfirmt;
	JButton SignupB;
	JLabel PassWarn;
	SignUp(String title){
		super(title);
		setSize( 400, 400 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout(new GridLayout(4,1,20,20));   	
		ID = new JLabel("ID",SwingConstants.CENTER);  
	    Pass = new JLabel("Password", SwingConstants.CENTER);
	    PassConfirm = new JLabel("Confirm Your Password", SwingConstants.CENTER);
	    IDt = new JTextArea();
	    Passt = new JPasswordField();
	    PassConfirmt = new JPasswordField();
	    PassWarn = new JLabel("Password does not match!");
	    SignupB= new JButton("SIGNUP");
	    SignupB.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Pass1=Passt.getText();
				String Pass2=PassConfirmt.getText();
				String ID=IDt.getText();
				PassConfirmt.getText();
				if(Pass1.equals(Pass2)) {
					System.out.println(Pass1 +" "+ Pass2);
					Data data= new Data();
				//	data.addPerson(ID, Pass1);
					setVisible(false);
					MyFrame frame = new MyFrame("Project");
					frame.setVisible(true);
					
				}
				else {
					PassWarn.setVisible(true);
				}
				
				
				
			}
	    	});    	
	    
	    add(ID);
	    add(IDt);
	    add(Pass);
	    add(Passt);
	    add(PassConfirm);
	    add(PassConfirmt);
	    add(SignupB);
	    add(PassWarn);
	    PassWarn.setVisible(false);
	    PassWarn.setForeground(Color.red);
	    
	}
}*/
 
public class AdminPanel
{
  public void main ( String[] args ) 
  {
    MyFrame frame = new MyFrame("Project"); 
    frame.setVisible( true );             
  }
}}
  
  
