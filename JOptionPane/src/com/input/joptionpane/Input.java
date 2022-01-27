package com.input.joptionpane;

import javax.swing.JOptionPane;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String Name;
		String surName;
		
		Name = JOptionPane.showInputDialog("Please Enter Your Name");
		surName = JOptionPane.showInputDialog("Please Enter Your surname");
		
		JOptionPane.showMessageDialog(null, surName + "" + Name);
		
		int firstNumber;
		int secondNumber;
		String Input;
		
		Input = JOptionPane.showInputDialog("Enter the first number");
		firstNumber = Integer.parseInt(Input);
		
		Input = JOptionPane.showInputDialog("Enter the second number");
		secondNumber = Integer.parseInt(Input);
		
		double Average = (firstNumber + secondNumber ) / 2.0;
		
		JOptionPane.showMessageDialog(null, "Average" + Average);
	
		
	}

}
