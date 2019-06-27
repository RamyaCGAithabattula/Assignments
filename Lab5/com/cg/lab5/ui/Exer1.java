package com.cg.lab5.ui;

import javax.swing.*;
import java.awt.event.*; 

public class Exer1 extends JFrame implements ActionListener{

	JRadioButton s1,s2,s3;    
	JButton b;    
	Exer1(){      
	s1=new JRadioButton("Red");    
	s1.setBounds(100,50,100,30);      
	s2=new JRadioButton("Yellow");    
	s2.setBounds(100,100,100,30); 
	s3=new JRadioButton("Green");    
	s3.setBounds(100,150,100,30);
	ButtonGroup bg=new ButtonGroup();    
	bg.add(s1);bg.add(s2);bg.add(s3);    
	b=new JButton("click");    
	b.setBounds(100,200,80,30);    
	b.addActionListener(this);    
	add(s1);add(s2);add(s3);add(b);    
	setSize(300,300);    
	setLayout(null);    
	setVisible(true);    
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		    if(s1.isSelected()){    
			JOptionPane.showMessageDialog(this,"Stop");    
			}    
			if(s2.isSelected()){    
			JOptionPane.showMessageDialog(this,"Ready");    
			}  
			if(s3.isSelected()){    
			JOptionPane.showMessageDialog(this,"Go");    
			} 
			}    
			public static void main(String args[]){    
			new Exer1();    
			}
			
}


