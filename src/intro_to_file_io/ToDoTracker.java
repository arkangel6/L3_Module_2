package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoTracker implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton button, button2, button3, button4;
	static ArrayList<String> tasks;
	
		public static void main(String[] args) {
			ToDoTracker tdt = new ToDoTracker();
			tdt.buildGUI();
			tasks = new ArrayList<String>();
			
			String contents =  "";
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/file1.txt"));
				
				String line = br.readLine();
				while(line != null) {
					contents += line + "\n";
					line = br.readLine();
				}
				br.close();
				JOptionPane.showMessageDialog(null, contents);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/file1.txt"));
				
				String line = br.readLine();
				while(line != null) {
					tasks.add(line);
					line = br.readLine();
				}
				br.close();
				
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
			
			
		
			
			
			}
			
	

		
		
		public void buildGUI() {
			
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		
		button = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		
		button.setText("add task");
		button2.setText("remove task");
		button3.setText("save");
		button4.setText("load");
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);	
		button4.addActionListener(this);	
		
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		}

	
		int counter = 0;
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(button)) {
				
				String task = JOptionPane.showInputDialog("enter task");
				tasks.add(task);
				
			}
			if(e.getSource().equals(button2)) {
				

				
				String output = "";
				
				for(int i = 0; i < tasks.size(); i++) {
					output += i + " " + tasks.get(i);
					output += "\n";
				}
				//int length = tasks.size();
				//while(tasks.size() == length) {
				String answer = JOptionPane.showInputDialog("Which task do you want to remove? \n" + output + "\n->enter the number");
				int a = Integer.parseInt(answer);
				
				
				
				if(a == 0) {
					tasks.remove(0);
				}
				else if(a > 0 && a <= tasks.size()-1) {
					tasks.remove(a);
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid number");
				//}
				}
			}
			
			if(e.getSource().equals(button3)) {
				
				FileWriter fw;
				try {
					fw = new FileWriter("src/intro_to_file_io/file1.txt") ;
					
					String output = "";
					
					for(int i = 0; i < tasks.size(); i++) {
						output +=  tasks.get(i);
						output += "\n";
					}
					
					fw.write(output);
					
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			if(e.getSource().equals(button4)) {
				
				
				
				String contents =  "";
				try {
					BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/file1.txt"));
					
					String line = br.readLine();
					while(line != null) {
						contents += line + "\n";
						line = br.readLine();
					}
					br.close();
					JOptionPane.showMessageDialog(null, contents);
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				}
				
			}
			
		}


		

