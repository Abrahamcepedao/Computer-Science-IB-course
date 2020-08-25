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

public class PersonalityTest {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	
	public PersonalityTest(){
		prepareGUI();
	}
	
	public static void main(String[] args){
		PersonalityTest numbers = new PersonalityTest();
		numbers.showTextFieldDemo();
	}
	
	private void prepareGUI(){
		mainFrame = new Frame ();
		mainFrame.setSize(1000,10000);
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
		controlPanel.setSize(900,9000);
		controlPanel.setVisible(true);
		
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true); 
		
		
	}
	private void showTextFieldDemo(){
		headerLabel.setText("PersonalityTest"); 
		Label lbFirstQuestion = new Label("First question:", Label.CENTER);
		CheckboxGroup cgone = new CheckboxGroup();
		Checkbox cgoneOne = new Checkbox("1", cgone, false);
		cgoneOne.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgoneTwo = new Checkbox("2", cgone, false);
		cgoneTwo.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgoneThree = new Checkbox("3", cgone, false);
		cgoneThree.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgoneFour = new Checkbox("4", cgone, false);
		cgoneFour.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgoneFive = new Checkbox("5", cgone, false);
		cgoneFive.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Label lbSecondQuestion = new Label("First question:", Label.CENTER);
		CheckboxGroup cgtwo = new CheckboxGroup();
		Checkbox cgtwoOne = new Checkbox("1", cgtwo, false);
		cgtwoOne.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgtwoTwo = new Checkbox("2", cgtwo, false);
		cgoneTwo.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgtwoThree = new Checkbox("3", cgtwo, false);
		cgtwoThree.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgtwoFour = new Checkbox("4", cgtwo, false);
		cgtwoFour.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		Checkbox cgtwoFive = new Checkbox("5", cgtwo, false);
		cgtwoFive.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            
	         }
	     });
		
		controlPanel.add(lbFirstQuestion);
		controlPanel.add(cgoneOne);
		controlPanel.add(cgoneTwo);
		controlPanel.add(cgoneThree);
		controlPanel.add(cgoneFour);
		controlPanel.add(cgoneFive);
		controlPanel.add(lbSecondQuestion);
		controlPanel.add(cgtwoOne);
		controlPanel.add(cgtwoTwo);
		controlPanel.add(cgtwoThree);
		controlPanel.add(cgtwoFour);
		controlPanel.add(cgtwoFive);
		
		mainFrame.setVisible(true);
		
	}
	
}
