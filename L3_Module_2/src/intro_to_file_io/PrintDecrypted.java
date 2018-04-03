package intro_to_file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class PrintDecrypted {
	public static void main(String[] args) {
		String filename = null; 
		JFileChooser jfc = new JFileChooser();
		jfc.setSelectedFile(new File("text2.txt"));
		int returnVal = jfc.showOpenDialog(null);
		if(returnVal == jfc.APPROVE_OPTION) {
			filename = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(filename);
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			while(line != null) {
				

				char[] m = line.toCharArray();
				char[] fin = new char[m.length];
				int counter = 0;
				for(char letter : m) {
					int let = (int) letter;
					
					if(let - 5 < 97) {
						fin[counter] = (char) ((let-4+122) - 97);
						
					}
					else {
					fin[counter] = (char) (let - 5);
					}
					counter++;
				}
					
				for(char f : fin) {
					System.out.print(f);
				}
			
				System.out.println();
				line = br.readLine();
			}
		}
		catch(FileNotFoundException e){
		
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff