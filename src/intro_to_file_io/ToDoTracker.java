package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoTracker implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton button, button2, button3, button4;
		public static void main(String[] args) {
			ToDoTracker tdt = new ToDoTracker();
			tdt.buildGUI();
			
		}
		
		
		public void buildGUI() {
			
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);	
		button4.addActionListener(this);	
		
		
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
