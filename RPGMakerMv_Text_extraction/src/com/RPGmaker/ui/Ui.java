package com.RPGmaker.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ui extends JFrame{
	/**
	 * 
	 */
	private Button b1,b2,b3,b4,b5,b6;
	private JPanel jp1;
	private JLabel jl1;
	
	Ui(){
		b1=new Button("ReaderMap");
		b2=new Button("ReaderItem");
		b3=new Button("ReaderEvent");
		b4=new Button("WriteMap");
		b5=new Button("WriteItem");
		b6=new Button("WriteEvent");
		
		jp1=new JPanel();
		jp1.setLayout(new GridLayout(3, 2));
		
		jp1.add(b1);
		jp1.add(b2);
		jp1.add(b3);
		jp1.add(b4);
		jp1.add(b5);
		jp1.add(b6);
		
		jl1=new JLabel("Only one type can be converted at a time, please delete the source file before converting other types");
		
		this.setLayout(new BorderLayout());
		this.add(jp1);
		this.add(jl1,BorderLayout.NORTH);

		this.setSize(400, 600);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setTitle("RPG_maker_JsonUtil");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
