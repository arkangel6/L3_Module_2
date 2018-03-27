package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class SaveMessage {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);
			String message = JOptionPane.showInputDialog("Enter something");
			
			char[] m = message.toCharArray();
			char[] newM = new char[m.length];
			int counter = 0;
			for(char letter : m) {
				int let = (int) letter;
				
				if(let + 5 > 122) {
					newM[counter] = (char) ((let+4-122) + 97);
					
				}
				else {
				newM[counter] = (char) (let + 5);
				}
				counter++;
			}
				
			String newMessage = "";
			for(char x : newM) {
				newMessage +="" + x;
			}
			
			fw.write("\n" + newMessage);
			
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test2.txt"));
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
			
			}	 catch(IOException e1) {
			
			e1.printStackTrace();
			
		} 
		
	
}
}
