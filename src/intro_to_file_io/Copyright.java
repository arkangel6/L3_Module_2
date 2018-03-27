package intro_to_file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Copyright {
	public static void main(String[] args) {
		File file = new File("scr/");
		File[] files = file.listFiles();
		for(int i = 0; i < files.length; i++) {
			if(files[i].getName().contains(".java")) {
				try {
					BufferedReader br = new BufferedReader(new FileReader(files[i].getName()));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
