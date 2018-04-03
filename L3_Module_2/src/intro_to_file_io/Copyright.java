package intro_to_file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyright {
	public static void main(String[] args) {
		File file = new File("src/intro_to_file_io/");
		File[] files = file.listFiles();
		//System.out.println(files);
		for(int i = 0; i < files.length; i++) {
			
			if(files[i].getName().contains("2.java")) {
				System.out.println(files[i].getName());
						try {
							FileWriter fw = new FileWriter("src/intro_to_file_io/" + files[i].getName(), true);
							BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/" + files[i].getName()));
							
							
							
								
							
								
								fw.write("//Copyright © 2017 by jeff");
								String line = br.readLine();
								while(line != null) {
									//System.out.println(line);
									fw.write(line);
									line = br.readLine();
								}
								br.close();
								fw.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							
							
						}
						
						
						
					/*try {
						
						FileWriter fw = new FileWriter("src/intro_to_file_io/" + files[i].getName(), true);
						
						fw.write("//Copyright © 2017 by jeff");
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
				
			}
		}
	}
}
//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff//Copyright © 2017 by jeff