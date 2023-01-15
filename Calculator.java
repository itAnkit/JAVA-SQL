import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class Calculator extends WindowAdapter implements ActionListener{
Frame f;
Label l1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bhist;
double ans=0;
double num1,num2;
int check;
String st= "";
Calculator(){
f= new Frame("CALCULATOR");
l1=new Label();
l1.setBackground(Color.cyan);
l1.setFont(new Font("Times New Roman",1,30));
l1.setBounds(50,50,260,60);
b1=new Button("1");
b1.setBounds(50,340,50,50);
b2=new Button("2");
b2.setBounds(120,340,50,50);
b3=new Button("3");
b3.setBounds(190,340,50,50);
b4=new Button("4");
b4.setBounds(50,270,50,50);
b5=new Button("5");
b5.setBounds(120,270,50,50);
b6=new Button("6");
b6.setBounds(190,270,50,50);
b7=new Button("7");
b7.setBounds(50,200,50,50);
b8=new Button("8");
b8.setBounds(120,200,50,50);
b9=new Button("9");
b9.setBounds(190,200,50,50);
b0=new Button("0");
b0.setBounds(50,410,50,50);
badd=new Button("+");
badd.setBounds(260,340,50,50);
bsub=new Button("-");
bsub.setBounds(260,270,50,50);
bmult=new Button("*");
bmult.setBounds(260,200,50,50);
bdiv=new Button("/");
bdiv.setBounds(260,130,50,50);
bmod=new Button("%");
bmod.setBounds(190,130,50,50);
bcalc=new Button("=");
bcalc.setBounds(190,410,120,50);
bclr=new Button("CE");
bclr.setBounds(120,410,50,50);
bhist=new Button("History");
bhist.setBounds(50,130,120,50);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this);
bhist.addActionListener(this);
f.addWindowListener(this);
//ADDING TO FRAME
f.add(l1);
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);
f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bcalc);f.add(bclr);f.add(bhist);
f.setSize(360,500);
f.setLayout(null);
f.setVisible(true);
}
//FOR CLOSING THE WINDOW
public void windowClosing(WindowEvent e) {
System.out.println("Calculator CLosed");
System.exit(0);
}
public void actionPerformed(ActionEvent e){
String z,zt=l1.getText();
//NUMBER BUTTON
String op=e.getActionCommand();
switch(op)
{
case "1":
{
	st+=op;
	z=zt+"1";
	l1.setText(z);
}
break;
case "2":
{
	st+=op;
	z=zt+"2";
	l1.setText(z);
}
break;
case "3":
{
	st+=op;
	z=zt+"3";
	l1.setText(z);
}
break;
case "4":
{
	st+=op;
	z=zt+"4";
	l1.setText(z);
}
break;
case "5":
{
	st+=op;
	z=zt+"5";
	l1.setText(z);
}
break;
case "6":
{
	st+=op;
	z=zt+"6";
	l1.setText(z);
}
break;
case "7":
{
	st+=op;
	z=zt+"7";
	l1.setText(z);
}
break;
case "8":
{
	st+=op;
	z=zt+"8";
	l1.setText(z);
}
break;
case "9":
{
	st+=op;
	z=zt+"9";
	l1.setText(z);
}
break;
case "0":
{
	st+=op;
	z=zt+"0";
	l1.setText(z);
}
break;
case "+":
{
	st+=op;
	try
	{
	num1=Double.parseDouble(zt);
	}
	catch(NumberFormatException ee)	{System.out.println("Invalid Number");}
	z=" ";
	l1.setText(z);
	check=1;
}
break;

case "-":
{
	st+=op;
	try
	{
	num1=Double.parseDouble(zt);
	}
	catch(NumberFormatException ee)	{System.out.println("Invalid Number");}
	z=" ";
	l1.setText(z);
	check=2;
}
break;

case "*":
{
	st+=op;
	try
	{
	num1=Double.parseDouble(zt);
	}
	catch(NumberFormatException ee)	{System.out.println("Invalid Number");}
	z=" ";
	l1.setText(z);
	check=3;
}
break;

case "/":
{
	st+=op;
	try
	{
	num1=Double.parseDouble(zt);
	}
	catch(NumberFormatException ee)	{System.out.println("Invalid Number");}
	z=" ";
	l1.setText(z);
	check=4;
}
break;

case "%":
{
	st+=op;
	try
	{
	num1=Double.parseDouble(zt);
	}
	catch(NumberFormatException ee)	{System.out.println("Invalid Number");}
	z=" ";
	l1.setText(z);
	check=5;
}
break;

case "=":
{
	st+=op;
	try
	{
	num2=Double.parseDouble(zt);
	}
	catch(NumberFormatException ee)	{System.out.println("Invalid Number");}
	switch(check)
	{
	case 1:
		ans=num1+num2;
		break;
	case 2:
		ans=num1-num2;
		break;
	case 3:
		ans=num1*num2;
		break;
	case 4:
		ans=num1/num2;
		break;
	case 5:
		ans=num1%num2;
		break;
	}
	
	l1.setText(String.valueOf(ans));
	st+=ans;
	System.out.println("Opertation is  : "+st);
	addrecord(st);
	st="";
}
break;

case "CE":
{
	num1=num2=check=0;
	ans=0;
	st="";
	l1.setText("");
	
}
break;

case "History":
{
	System.out.println("Displaying History");
	new HistoryCalc();
}
break;

}

}

public void addrecord(String str)
{
	try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","65432100"))
	{
		PreparedStatement st=con.prepareStatement("Insert into Calchistory values(?)");
		st.setString(1, str);
		st.executeUpdate();
		System.out.println("Saved in History");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}

public static void main(String args[]){
new Calculator();
}
}