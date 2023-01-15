import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class HistoryCalc {

	HistoryCalc()
	{
		JFrame frm=new JFrame("History");
		frm.setLayout(null);
		frm.setSize(400,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea area=new JTextArea();
		JLabel l=new JLabel("History");
		l.setBounds(150,50,50,30);
		frm.add(l);
		area.setBounds(60,75,250,200);  
		frm.add(area);
		area.setFont(new Font("Times New Roman",1,24));
		area.setBackground(Color.cyan);
		area.setEditable(false);
		String dta="";
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","65432100"))
		{
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("Select * from Calchistory ");
			rs.afterLast();
			while(rs.previous())
			{
				dta+=rs.getString(1)+"\n";
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		area.setText(dta);
	}
	
}
