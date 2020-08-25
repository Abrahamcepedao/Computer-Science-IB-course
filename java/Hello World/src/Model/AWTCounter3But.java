package Model;
import java.awt.*;
import java.awt.event.*;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTCounter3But extends Frame {
	private TextField tfCount;
	private Button btnDollars, btnEuros, btnReset;
	private double count = 100;


// Constructor to setup the GUI components and event handlers
	public AWTCounter3But () {
		setLayout(new FlowLayout());
		add(new Label("Enter Pesos")); // an anonymous instance of Label
		
		tfCount = new TextField("0", 20);
		tfCount.setEditable(true); // read-only
		add(tfCount); // "super" Frame adds tfCount
		count = Double.parseDouble(tfCount.getText());
		btnDollars = new Button("getDollars");
		add(btnDollars);
// Construct an anonymous instance of an anonymous inner class.
// The source Button adds the anonymous instance as ActionEvent listener
		btnDollars.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				count = count / 19.02;
				tfCount.setText(count + "");
			}
		});

		btnEuros = new Button("getEuros");
		add(btnEuros);
		btnEuros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				count = count / 22;
				tfCount.setText(count + "");
			}
		});
	
		btnReset = new Button("Reset");
		add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				count = 100;
				tfCount.setText("0");
			}
		});

		setTitle("Counter example");
		setSize(400, 400);
		setVisible(true);
		setBackground(Color.cyan);
	


	}
// The entry main method
	public static void main(String[] args) {
		new AWTCounter3But(); // Let the constructor do the job
	}
}
package Model;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter3But extends Frame {
	
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	protected double count;
	
	public AWTCounter3But(){
		prepareGUI();
	}
	
	public static void main(String[] args){
		AWTCounter3But awtControlDemo = new AWTCounter3But();
		awtCounterBut.showTextFieldCounter();
	}
	
	private void prepareGUI(){
		mainFrame = new Frame("Exchange converter");
		mainFrame.setSize(400,400);
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
		statusLabel.setSize(350,100);
		
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		controlPanel.setBackground(Color.blue);
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true); 
	}

	private void showTextFieldCounter(){
		headerLabel.setText("Control in action"); 
		
		Label pesoslabel= new Label("Enter pesos: ", Label.RIGHT);
		TextField pesosText = new TextField(16);
		passwordText.setEchoChar('?');
		
		Button btnDollars = new Button("to dollars");
		Button btnEuros = new Button("to euros");
	
		btnDollars.addActionListener(new ActionListener() {
			@Override
			count = count / 19;
		}); 
		btnEuros.addActionListener(new ActionListener() {
			@Override
			count = count / 22;
		}); 
	
		controlPanel.add(idlabel);
		controlPanel.add(userText);
		controlPanel.add(passwordLabel); 
		controlPanel.add(passwordText);
		controlPanel.add(nameLabel);
		controlPanel.add(firstNameText);
		controlPanel.add(lastNameLabel);
		controlPanel.add(lastNameText);
		controlPanel.add(loginButton);
		mainFrame.setVisible(true);
	}
}