package InstaConcepts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("text.CSV");
//		f.setReadOnly();	//one time dha write panalam
//		f.setWritable(true);
		System.out.println(f.getAbsolutePath()); //it will show the file path
		System.out.println(f.getPath());
		
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("already existed");
		}
		
		FileWriter fw=new FileWriter(f);
		fw.append("Name:Pokesh Kumar\n");
		fw.append("Age:23 \n");
		fw.append("say my name\t");
		fw.append("Pokesh kumar");
		fw.close(); //we need to use close() every time we complete writing
		
		// Get Whole Files
		FileReader fr=new FileReader(f);
		Scanner sc=new Scanner(fr);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}

		// Get single Single words
		Scanner sw=new Scanner(f);
		System.out.println(sw.next()); 	//single word ah eduka
	
		while(sw.hasNext()) {
			System.out.println(sw.next());
		}
		 
		if(f.delete()){
			System.out.println("Deleted");
		}

	}

}
