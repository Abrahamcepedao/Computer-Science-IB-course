package Networks;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class topologies {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					topologies window = new topologies();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public topologies() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNetworkTopologies = new JLabel("Network topologies");
		lblNetworkTopologies.setBounds(140, 7, 153, 16);
		frame.getContentPane().add(lblNetworkTopologies);
		
		
		JButton btnNewButton = new JButton("BUS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Every computer and network device is connected to a single cable");
			}
		});
		btnNewButton.setBounds(30, 35, 117, 66);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("RING");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "It forms a ring as each computer is connected to another two computers");
			}
		});
		button.setBounds(176, 35, 117, 66);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("STAR");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "All computer use a cable to connect to the same hub, which acts as the central noce");
			}
		});
		button_1.setBounds(315, 35, 117, 66);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("MESH");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				JOptionPane.showMessageDialog(null, "It is a point to point connection between each computer wiht the use of nodes");
			}
		});
		button_2.setBounds(30, 125, 117, 66);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("TREE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "It has a root node to which other networks devices are connected, with at least three levels in order to form a hierarchy");
			}
		});
		button_3.setBounds(176, 125, 117, 66);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("HYBRID");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "It is a combination of two different topolgies");
			}
		});
		button_4.setBounds(315, 125, 117, 66);
		frame.getContentPane().add(button_4);
	}
}
