import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces

// An AWT GUI program inherits from the top-level container java.awt.Frame
public class ConvertD extends Frame implements ActionListener {
private Label lblInput; // Declare input Label
private Label lblOutput; // Declare output Label
private TextField tfInput; // Declare input TextField
private TextField tfOutput; // Declare output TextField
private int conv = 0; // Accumulated sum, init to 0

// Constructor to setup the GUI components and event handlers
public ConvertD() {
setLayout(new FlowLayout());
// "super" Frame (container) sets layout to FlowLayout, which arranges
// the components from left-to-right, and flow to next row from top-to-bottom.

lblInput = new Label("Enter the amount in pesos: "); // Construct Label
add(lblInput); // "super" Frame container adds Label component

tfInput = new TextField(10); // Construct TextField
add(tfInput); // "super" Frame adds TextField

// ActionEvent handler - Called back upon hitting "enter" key on TextField
tfInput.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
// Get the String entered into the TextField tfInput, convert to int
int numberIn = Integer.parseInt(tfInput.getText());
conv = (int) (numberIn/19.5); // Accumulate numbers entered into sum
tfInput.setText(""); // Clear input TextField
tfOutput.setText(conv + ""); // Display sum on the output TextField
// convert int to String

}


});

lblOutput = new Label("In Dollars is: "); // allocate Label
add(lblOutput); // "super" Frame adds Label

tfOutput = new TextField(10); // allocate TextField
tfOutput.setEditable(false); // read-only
add(tfOutput); // "super" Frame adds TextField

setTitle("Exchange Rate"); // "super" Frame sets title
setSize(230, 120); // "super" Frame sets initial window size
setVisible(true); // "super" Frame shows
setBackground(Color.red);
}

// The entry main() method
public static void main(String[] args) {
// Invoke the constructor to setup the GUI, by allocating an anonymous instance
new ConvertD();
}




}