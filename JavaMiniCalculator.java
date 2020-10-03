import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class JavaMiniCalculator {

	static JFrame frame;
	static double res;
	static int f=0,f1=0;
	static boolean oflag=false,eflag=false,pflag=false;
	JButton k0,k1,k2,k3,k4,k5,k6,k7,k8,k9,sum,sub,mul,div,eql,sqr,cube,root,clr,dec;
	JTextField pan;
	JPanel p1,p2,p3;
	JLabel l;
	void createGUI()
	{
		frame=new JFrame("Calculator");
		frame.setLayout(new BorderLayout());
		frame.setLocation(450,250);
		pan=new JTextField(20);
		pan.setBackground(Color.LIGHT_GRAY);
		pan.setFont(new Font("Arial",Font.PLAIN,20));
		frame.add(pan,BorderLayout.NORTH);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		
		p1.setLayout(new GridLayout(4,3,8,10));
		p2.setLayout(new GridLayout(4,1,8,10));
		p3.setLayout(new GridLayout(4,1,8,10));
		
		k0=new JButton("0");
		k1=new JButton("1");
		k2=new JButton("2");
		k3=new JButton("3");
		k4=new JButton("4");
		k5=new JButton("5");
		k6=new JButton("6");
		k7=new JButton("7");
		k8=new JButton("8");
		k9=new JButton("9");
		sum=new JButton("+");
		mul=new JButton("*");
		div=new JButton("/");
		sub=new JButton("-");
		eql=new JButton("=");
		sqr=new JButton("X^2");
		cube=new JButton("X^3");
		root=new JButton("x^1/2");
		clr=new JButton("CLR");
		dec=new JButton(".");
		
		sum.setForeground(Color.RED);
		sub.setForeground(Color.RED);
		mul.setForeground(Color.RED);
		div.setForeground(Color.RED);
		eql.setForeground(new Color(50,150,50));
		sqr.setForeground(Color.BLUE);
		cube.setForeground(Color.BLUE);
		root.setForeground(Color.BLUE);
		clr.setForeground(Color.MAGENTA);
		
		sum.setFont(new Font("Times New Roman",Font.BOLD,15));
		sub.setFont(new Font("Times New Roman",Font.BOLD,20));
		mul.setFont(new Font("Times New Roman",Font.BOLD,20));
		div.setFont(new Font("Times New Roman",Font.BOLD,20));
		dec.setFont(new Font("Times New Roman",Font.BOLD,20));
		eql.setFont(new Font("Times New Roman",Font.BOLD,15));
		
		sum.setBackground(new Color(135,206,240));
		sub.setBackground(new Color(135,206,240));
		mul.setBackground(new Color(135,206,240));
		div.setBackground(new Color(135,206,240));
		eql.setBackground(new Color(135,206,240));
		root.setBackground(new Color(135,206,240));
		sqr.setBackground(new Color(135,206,240));
		cube.setBackground(new Color(135,206,240));
		
		
		p1.add(k1);
		p1.add(k2);
		p1.add(k3);
		p1.add(k4);
		p1.add(k5);
		p1.add(k6);
		p1.add(k7);
		p1.add(k8);
		p1.add(k9);
		p1.add(k0);
		p1.add(dec);
		p1.add(clr);
		
		p2.add(sum);
		p2.add(sub);
		p2.add(mul);
		p2.add(eql);
		
		p3.add(div);
		p3.add(sqr);
		p3.add(cube);
		p3.add(root);
		
		frame.add(p1,BorderLayout.CENTER);
		frame.add(p2,BorderLayout.EAST);
		frame.add(p3,BorderLayout.WEST);
		
		l=new JLabel("!!JAVA MINI CALCI!!");
		l.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,20));
		l.setForeground(Color.DARK_GRAY);
		frame.add(l,BorderLayout.SOUTH);
		
		
		k0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"0");
				}
				else
				{
					pan.setText("0");
					oflag=false;
				}
			}
		});
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"1");
				}
				else
				{
					pan.setText("1");
					oflag=false;
				}
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"2");
				}
				else
				{
					pan.setText("2");
					oflag=false;
				}
			}
		});
		
		k3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"3");
				}
				else
				{
					pan.setText("3");
					oflag=false;
				}
			}
		});
		
		k4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"4");
				}
				else
				{
					pan.setText("4");
					oflag=false;
				}
			}
		});
		
		k5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"5");
				}
				else
				{
					pan.setText("5");
					oflag=false;
				}
			}
		});
		
		k6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"6");
				}
				else
				{
					pan.setText("6");
					oflag=false;
				}
			}
		});
		
		k7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"7");
				}
				else
				{
					pan.setText("7");
					oflag=false;
				}
			}
		});
		
		k8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"8");
				}
				else
				{
					pan.setText("8");
					oflag=false;
				}
			}
		});
		
		k9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+"9");
				}
				else
				{
					pan.setText("9");
					oflag=false;
				}
			}
		});
		
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(!oflag)
				{
					pan.setText(pan.getText()+".");
				}
				else
				{
					pan.setText(".");
					oflag=false;
				}
			}
		});
		
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1&&!oflag)res=res+a;
				else if(f==2&&!oflag)res=res-a;
				else if(f==3&&!oflag)res=res*a;
				else if(f==4&&!oflag)res=res/a;
				if(!oflag&&f==0)
					res=a+res;
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				f=1;
			}
		});
		
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1&&!oflag)res=a+res;
				else if(f==2&&!oflag)res=res-a;
				else if(f==3&&!oflag)res=res*a;
				else if(f==4&&!oflag)res=res/a;
				if(!oflag&&f==0)
					res=a-res;
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				f=2;
			}
		});
		
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1&&!oflag)res=a+res;
				else if(f==2&&!oflag)res=res-a;
				else if(f==3&&!oflag)res=res*a;
				else if(f==4&&!oflag)res=res/a;
				if(!oflag&&f==0)
					res=a;
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				f=3;
			}
		});
		
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1&&!oflag)res=a+res;
				else if(f==2&&!oflag)res=res-a;
				else if(f==3&&!oflag)res=res*a;
				else if(f==4&&!oflag)res=res/a;
				if(!oflag&&f==0)
					res=a;
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				f=4;
			}
		});
		
		sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1){
					res=a+res;
					res=(double)Math.pow(res,2);
					pflag=true;
				}
				else if(f==2){
					res=res-a;
					res=(double)Math.pow(res,2);
					pflag=true;
				}
				else if(f==3){
					res=res*a;
					res=(double)Math.pow(res,2);
					pflag=true;
				}
				else if(f==4){
					res=res/a;
					res=(double)Math.pow(res,2);
					pflag=true;
				}
				if(!pflag)
				res=(double)Math.pow(a,2);
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				pflag=false;
				f=0;
			}
		});
		
		cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1){
					res=a+res;
					res=(double)Math.pow(res,3);
					pflag=true;
				}
				else if(f==2){
					res=res-a;
					res=(double)Math.pow(res,3);
					pflag=true;
				}
				else if(f==3){
					res=res*a;
					res=(double)Math.pow(res,3);
					pflag=true;
				}
				else if(f==4){
					res=res/a;
					res=(double)Math.pow(res,3);
					pflag=true;
				}
				if(!pflag)
				res=(double)Math.pow(a,3);
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				pflag=false;
				f=0;
			}
		});
		
		root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(f==1){
					res=a+res;
					res=(double)Math.sqrt(res);
					pflag=true;
				}
				else if(f==2){
					res=res-a;
					res=(double)Math.sqrt(res);
					pflag=true;
				}
				else if(f==3){
					res=res*a;
					res=(double)Math.sqrt(res);
					pflag=true;
				}
				else if(f==4){
					res=res/a;
					res=(double)Math.sqrt(res);
					pflag=true;
				}
				if(!pflag)
				res=(double)Math.sqrt(a);
				else if(eflag)
					res=(double)Math.sqrt(a);
				pan.setText(Double.toString(res));
				oflag=true;
				eflag=false;
				pflag=false;
				f=0;
			}
		});
		
		eql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(pan.getText());
				if(!eflag)
				{
					if(f==1&&!oflag)res=a+res;
					else if(f==2&&!oflag)res=res-a;
					else if(f==3&&!oflag)res=res*a;
					else if(f==4&&!oflag)res=res/a;
				}
				pan.setText(Double.toString(res));
				eflag=oflag=true;
				f=0;
			}
		});
		
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				res=0;
				oflag=eflag=false;
				f=0;
				pan.setText("");
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMiniCalculator c=new JavaMiniCalculator();
		c.createGUI();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}