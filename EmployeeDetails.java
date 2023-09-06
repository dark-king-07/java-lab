package varun;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class EmployeeDetails 
{
    private static Color black;
	public static void main(String[] args) 
	{
	   JFrame f=new JFrame();
	   f.setSize(500,500);
	   GridLayout g1=new GridLayout(5,2);
	   f.setLayout(g1);
	   JPanel p1=new JPanel();
	   JPanel p2=new JPanel();
	   JPanel p3=new JPanel();
	   JPanel p4=new JPanel();
	   JPanel p5=new JPanel();
	   JPanel p6=new JPanel();
	   JPanel p7=new JPanel();
	   JPanel p8=new JPanel();
	   JPanel p9=new JPanel();
	   JPanel p10=new JPanel();
	   JLabel l1=new JLabel("NAME");
	   JLabel l2=new JLabel("ID");
	   JLabel l3=new JLabel("DOJ");
	   JLabel l4=new JLabel("DOB");
	   final JTextField f1=new JTextField();
	   final JTextField f2=new JTextField();
	   final JTextField f3=new JTextField();
	   final JTextField f4=new JTextField();
	   f1.setPreferredSize(new Dimension(200,40));
	   f2.setPreferredSize(new Dimension(200,40));
	   f3.setPreferredSize(new Dimension(200,40));
	   f4.setPreferredSize(new Dimension(200,40));
	   JButton b1 =new JButton("SUBMIT");
	   JButton b2 =new JButton("RESET");	
	   b1.addActionListener(new ActionListener() 
	   {
		   public void actionPerformed(ActionEvent e)
		   {
			   File fileobj=new File("C:\\Users\\Varun\\Documents\\file.txt");
			   try
			   {
				   FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
				   System.out.println("\nName: "+f1.getText()+"\nID: "+f2.getText()+"\nDOJ: "+f3.getText()+"DOB: "+f4.getText());
				   fw.write("\nName: "+f1.getText()+"\nID: "+f2.getText()+"\nDOJ: "+f3.getText()+"\nDOB: "+f4.getText()+"\n");
				   fw.close();
			   }
			   catch(IOException e1)
			   {
				   e1.printStackTrace();
			   }
		   }
	   });
	   b2.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e)
		   {
			  f1.setText("");
			  f2.setText("");
			  f3.setText("");
			  f4.setText("");
		   }
	   });
	   l1.setBorder(BorderFactory.createLineBorder(black,5));
	   l2.setBorder(BorderFactory.createLineBorder(black,5));
	   l3.setBorder(BorderFactory.createLineBorder(black,5));
	   l4.setBorder(BorderFactory.createLineBorder(black,5));
	   f1.setBorder(BorderFactory.createLineBorder(black,5));
	   f2.setBorder(BorderFactory.createLineBorder(black,5));
	   f3.setBorder(BorderFactory.createLineBorder(black,5));
	   f4.setBorder(BorderFactory.createLineBorder(black,5));
	   p1.add(l1);
	   p3.add(l2);
	   p5.add(l3);
	   p7.add(l4);
	   p2.add(f1);
	   p4.add(f2);
	   p6.add(f3);
	   p8.add(f4);
	   p9.add(b1);
	   p10.add(b2);
	   f.add(p1);
	   f.add(p2);
	   f.add(p3);
	   f.add(p4);
	   f.add(p5);
	   f.add(p6);
	   f.add(p7);
	   f.add(p8);
	   f.add(p9);
	   f.add(p10);
	   f.setVisible(true);
	}
}
