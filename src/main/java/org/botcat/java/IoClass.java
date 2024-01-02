package org.botcat.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.Writer;

public class IoClass {
	public static void main(String[] args) throws IOException {

		String File = System.getProperty("user.dir") + "//src//resources//test.txt";
		InputStream inputStream = new FileInputStream(File);
		OutputStream outputStream = new FileOutputStream(File);

		/** FileOutputStream */
		OutputStream Fout = new FileOutputStream(File);
		Fout.write(new String("Hello from FileinputStream").getBytes());
		Fout.close();

		/**
		 * BufferOutputStream More Performance than Fileoutput Stream Saves the data in
		 * buffer and then flush it to the outputfile
		 */
		OutputStream Bout = new BufferedOutputStream(new FileOutputStream(File));
		Bout.write(new String("Bout String").getBytes());
		Bout.flush();
		Bout.close();

		/** FileInputputStream */
		FileInputStream Fin = new FileInputStream(File);
		while (Fin.read() != -1) {
			System.out.print((char) Fin.read());
		}
		Fin.close();

		/**
		 * BufferedInputStream More Performance than FileInputStream
		 */
		InputStream Bin = new BufferedInputStream(new FileInputStream(File));
		while (Bin.read() != -1) {
			System.out.print((char) Bin.read());
		}
		Bin.close();

		/**
		 * SequenceInputStream
		 */

		FileInputStream input1 = new FileInputStream(File + "a.txt");
		FileInputStream input2 = new FileInputStream(File + "b.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}

		/**
		 * ByteArrayInputStream Java ByteArrayOutputStream class is used to write common
		 * data into multiple files. In this stream, the data is written into a byte
		 * array which can be written to multiple streams later. The
		 * ByteArrayOutputStream holds a copy of data and forwards it to multiple
		 * streams. The buffer of ByteArrayOutputStream automatically grows according to
		 * data.
		 */

		ByteArrayInputStream bin = new ByteArrayInputStream("ByteArrayInputStream".getBytes());

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(new FileOutputStream(File + "a.txt"));
		bout.writeTo(new FileOutputStream(File + "b.txt"));
		bout.flush();
		bout.close();

		/**
		 * DataOutputStream Java DataOutputStream class allows an application to write
		 * primitive Java data types to the output stream in a machine-independent way.
		 *
		 * Java application generally uses the data output stream to write data that can
		 * later be read by a data input stream.
		 */

		OutputStream dot = new DataOutputStream(outputStream);
		dot.write(65);
		dot.flush();
		dot.close();

		/**
		 * FileWriter and Reader
		 */

		Writer fileWriter = new FileWriter(File);
		fileWriter.write("This is going to FileWriter");
		fileWriter.close();

		Reader fileReader = new FileReader(File);
		while (fileReader.read() != -1) {
			System.out.println((char) fileReader.read());
		}
		fileReader.close();

		/**
		 * BufferWriter and BufferReader
		 */
//	    FileWriter writer = new FileWriter(File);
	    BufferedWriter buffer = new BufferedWriter(new FileWriter(File));
	    buffer.write("Welcome to javaTpoint.");
	    buffer.close();

//        FileReader fr=new FileReader(File);
        BufferedReader br=new BufferedReader(new FileReader(File));

        int i;
        while((i=br.read())!=-1){
        System.out.print((char)i);
        }
        br.close();
        br.close();
        //Read From comsole
        //    InputStreamReader r=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(r);
//        System.out.println("Enter your name");
//        String name=br.readLine();
//        System.out.println("Welcome "+name);

	}
}
