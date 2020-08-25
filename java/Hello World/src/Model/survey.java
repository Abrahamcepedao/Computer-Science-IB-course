package Model;
import java.awt.*;
import java.awt.event.*;

public class survey {
	
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	private Panel secondPanel;
	protected int grade;
	protected String ansGreece =  "Athenas";
	protected String ansStudent =  "Erika";
	protected String ansSubject =  "Computer science";
	protected String ansUniversity =  "Stanford";
	
	
	public survey(){
		prepareGUI();
	}
	
	public static void main(String[] args){
		survey Survey = new survey();
		Survey.showTextFieldDemo();
	}
	
	private void prepareGUI(){
		mainFrame = new Frame("Login System");
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
		
		secondPanel = new Panel();
		secondPanel.setLayout(new FlowLayout());
		secondPanel.setBackground(Color.red);
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true); 
	}

	private void showTextFieldDemo(){
		headerLabel.setText("Control in action"); 
		Label lbName = new Label("Enter your name", Label.CENTER);
		Label lbGreece = new Label("Capital city of Greece? ", Label.CENTER);
		Label lbStudent = new Label("Favorite Student? ", Label.CENTER);
		Label lbSubject = new Label("Best subject? ", Label.CENTER);
		Label lbUniversity = new Label("Best university ", Label.CENTER);
		TextField txName = new TextField(16);
		TextField txGreece = new TextField(16);
		TextField txStudent = new TextField(6);
		TextField txSubject = new TextField(16);
		TextField txUniversity = new TextField(16);
		
		
		Button btnCheck = new Button("Check answers");
	
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				if(txGreece.getText().equals(ansGreece)) {
					grade = grade + 25;
				} else {
					grade = grade - 5;
				}
				if(txStudent.getText().equals(ansStudent)) {
					grade = grade + 25;
				}else {
					grade = grade - 5;
				}
				if(txSubject.getText().equals(ansSubject)) {
					grade = grade + 25;
				}else {
					grade = grade - 5;
				}
				if(txUniversity.getText().equals(ansUniversity)) {
					grade = grade + 25;
				}else {
					grade = grade - 5;
				}
				String data = txName.getText() + " your grade is: " + grade;
				statusLabel.setText(data);
			
			}
			
			
		}); 
		Button btnReset = new Button("Reset answers");
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txName.setText("Enter again");
				txGreece.setText("Enter again");
				txStudent.setText("Enter again");
				txSubject.setText("Enter again");
				txUniversity.setText("Enter again");
				grade = 0;
				String data = "Your current score is: " + grade;
				statusLabel.setText(data);
			}
			
		});
	
		controlPanel.add(lbName);
		controlPanel.add(txName);
		controlPanel.add(lbGreece); 
		controlPanel.add(txGreece);
		controlPanel.add(lbStudent);
		controlPanel.add(txStudent);
		controlPanel.add(lbSubject);
		controlPanel.add(txSubject);
		controlPanel.add(lbUniversity);
		controlPanel.add(txUniversity);
		controlPanel.add(btnCheck);
		controlPanel.add(btnReset);
		mainFrame.setVisible(true);
	}
}	
