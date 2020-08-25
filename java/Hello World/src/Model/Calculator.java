package Model;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	protected double result;
	protected double firstNum;
	protected double secondNum;
	protected double thirdNum;
	
	public Calculator(){
		prepareGUI();
	}
	
	public static void main(String[] args){
		Calculator numbers = new Calculator();
		numbers.showTextFieldDemo();
	}
	
	private void prepareGUI(){
		mainFrame = new Frame ();
		mainFrame.setSize(1000,1000);
		mainFrame.setLayout(new GridLayout(4, 4));
		mainFrame.setBackground(Color.white);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			} 
		}); 
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		statusLabel = new Label(); 
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350,400);
		
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(Color.red);
		controlPanel.setSize(600,600);
		controlPanel.setVisible(true);
		
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true); 
		
		
	}
	private void showTextFieldDemo(){
		headerLabel.setText("Calculator"); 
		Label lbFirstNumber = new Label("First number:", Label.CENTER);
		Label lbSecondNumber = new Label("Second number:", Label.CENTER);
		TextField txFirstNumber = new TextField(16);
		txFirstNumber.setText("0");
		TextField txSecondNumber = new TextField(16);
		txSecondNumber.setText("0");
		CheckboxGroup cgp = new CheckboxGroup();
		Checkbox check = new Checkbox("+ 10",cgp,false);
		check.setBounds(100,100, 150,50); 
		check.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            result = result + 10;
	            statusLabel.setText("It works " + (e.getStateChange()==1?result:result));
	         }
	     });
		Checkbox check2 = new Checkbox("+ 100",cgp,false);
		check2.setBounds(100,100, 150,50); 
		check2.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            result = result + 100;
	            statusLabel.setText("It works perfectly " + (e.getStateChange()==1?result:result));
	         }
	     });
		Checkbox check3 = new Checkbox("+ 1000",cgp,false);
		check3.setBounds(100,100, 150,50); 
		check3.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            result = result + 1000;
	            statusLabel.setText("It works perfectlyy " + (e.getStateChange()==1?result:result));
	         }
	     });
		Button btnSum = new Button("+");
		btnSum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txFirstNumber.getText());
				secondNum = Double.parseDouble(txSecondNumber.getText());
				result = firstNum + secondNum;
				String data = "The result is: " + result;
				statusLabel.setText(data);
			}
			
		});
		Button btnMult = new Button("*");
		btnMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Integer.parseInt(txFirstNumber.getText());
				secondNum = Integer.parseInt(txSecondNumber.getText());
				result = firstNum * secondNum;
				String data = "The result is: " + result;
				statusLabel.setText(data);
			}
			
		});
		Button btnSubs = new Button("-");
		btnSubs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Integer.parseInt(txFirstNumber.getText());
				secondNum = Integer.parseInt(txSecondNumber.getText());
				result = firstNum - secondNum;
				String data = "The result is: " + result;
				statusLabel.setText(data);
			}
			
		});
		Button btnDivi = new Button("/");
		btnDivi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Integer.parseInt(txFirstNumber.getText());
				secondNum = Integer.parseInt(txSecondNumber.getText());
				result = firstNum / secondNum;
				String data = "The result is: " + result;
				statusLabel.setText(data);
			}
			
		});
		Button btnExpo = new Button("expo");
		btnExpo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Integer.parseInt(txFirstNumber.getText());
				secondNum = Integer.parseInt(txSecondNumber.getText());
				result = (int) Math.pow(firstNum, secondNum);
				String data = "The result is: " + result;
				statusLabel.setText(data);
			}
			
		});
		
		Button btnReset = new Button("Reset calculation");
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String data = "=0";
				statusLabel.setText(data);
				txFirstNumber.setText("0");
				txSecondNumber.setText("0");
			}
			
		});
		Choice choice = new Choice();
		choice.setBounds(100,100, 75,75); 
		choice.add("100");
		choice.add("200");
		choice.add("300");
		choice.add("400");
		choice.add("500");
		choice.add("600");
		Button btnExecuteChoice = new Button("add");
		btnExecuteChoice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg2) {
				// TODO Auto-generated method stub
				thirdNum = Integer.parseInt(choice.getItem(choice.getSelectedIndex()));
				result = result + thirdNum;
				String data = "The result is: "+ result;
				statusLabel.setText(data);
			}
		});
		
		
		controlPanel.add(lbFirstNumber);
		controlPanel.add(txFirstNumber);
		controlPanel.add(lbSecondNumber);
		controlPanel.add(txSecondNumber);
		controlPanel.add(btnSum);
		controlPanel.add(btnSubs);
		controlPanel.add(btnMult);
		controlPanel.add(btnDivi);
		controlPanel.add(btnExpo);
		controlPanel.add(btnReset);
		controlPanel.add(check);
		controlPanel.add(check2);
		controlPanel.add(check3);
		controlPanel.add(choice);
		controlPanel.add(btnExecuteChoice);
		mainFrame.setVisible(true);
		
	}
	
}
