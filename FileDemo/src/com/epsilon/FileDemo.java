package com.epsilon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;

public class FileDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("output.txt");

			// fs.write(65);

			String s = "Lionell Messi is the best footballer in this world";

			byte b[] = s.getBytes();

			fs.write(b);
			fs.close();

			FileInputStream fin = new FileInputStream("output.txt");

			//byte c[] = fin.readAllBytes();

			/*for (byte bc : c) {
				//System.out.print((char) bc);
			}*/

			//fin.close();
			FileInputStream fin2 = new FileInputStream("output2.txt");

			/*SequenceInputStream sin = new SequenceInputStream(fin, fin2);

			int i;
			while((i=sin.read())!= -1) {
				System.out.print((char)i);
			}

			sin.close();*/
			
			
			
			File file1 = new File("/Users/leninlawrence/Documents/EpsilonJava/FileDemo");
			File file = new File(file1, "output2.txt");
			System.out.println(file.canExecute());
			for(String a: file1.list()) {
				System.out.println(a);;
			}
			
			RandomAccessFile f = new RandomAccessFile(file1, "r");
			f.seek(20);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
