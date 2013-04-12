package changes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryResources {

	
	public static void writer (File file, String text) throws IOException{
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
		{
			writer.append(text);
			
		}
	}
	public static void writer (File wfile, File rfile) throws IOException{
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));BufferedReader reader = new BufferedReader(new FileReader(rfile)))
		{
			String line;
			while ((line = reader.readLine()) != null){
				writer.append(line);
				
			}
			}
			
		}
	}	


