package Cofetarie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Login extends JFrame implements ActionListener
{
 JButton Cancel;
 JButton OK;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  text1,text2;
	Login()
	{
	    label1 = new JLabel();
		label1.setText("Username:");//label pentru username
		text1 = new JTextField(15);//text field pentru introducere username

		label2 = new JLabel();//label pentru parola
		label2.setText("Password:");
	    text2 = new JPasswordField(15);//text field pentru introducere parola
	    //this.setLayout(new BorderLayout());
 
		OK=new JButton("OK");
                Cancel=new JButton ("Cancel");
		
        panel=new JPanel(new GridLayout(3,1));//adauga toate sectiunile de mai sus intr-un panel
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(OK);
                panel.add(Cancel);
	    add(panel,BorderLayout.CENTER);
       OK.addActionListener(this);
       Cancel.addActionListener(this);
        setTitle("LOGIN COFETARIE");//titlu pt panell
	}
   public void actionPerformed(ActionEvent ae)//se verifica actiunea performata
	{
            if (Cancel == ae.getSource()) {
                System.exit(0);//daca s-a selectat butonul de cancel, se opreste programul
            }
                
		String value1=text1.getText();
		String value2=text2.getText();
        if (value1.equals("Cofetarie") && value2.equals("Laura")) {
		MeniulPrincipal page=new MeniulPrincipal(); /** se trece la MeniulPrincipal*/
		page.setVisible(true);
		JLabel label = new JLabel("Welcome:"+value1);
        page.getContentPane().add(label);
	}
		else{//daca parola si/sau usernameul sunt gresite se afiseaza mesajul specificat
			System.out.println("enter the valid username and password");
			JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
	}
}
}
 class LoginC//se seteaza dimensiunile la casuta de login
{
	public static void main(String arg[])
	{
		try
		{
		Login frame=new Login();
		frame.setSize(350,150);
		frame.setVisible(true);
		}
	catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}
	}
}
 
 

 
