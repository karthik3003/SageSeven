package filewrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritingToFile {
	int word;
	int numSent;
	int shortest;
	int longest;
	int average;

	public BufferedWritingToFile() {
		// TODO Auto-generated constructor stub
	}
	

	public BufferedWritingToFile(int word, int numSent, int shortest, int longest, int average) {
		super();
		this.word = word;
		this.numSent = numSent;
		this.shortest = shortest;
		this.longest = longest;
		this.average = average;
	}
	


	public int getWord() {
		return word;
	}


	public void setWord(int word) {
		this.word = word;
	}


	public int getNumSent() {
		return numSent;
	}


	public void setNumSent(int numSent) {
		this.numSent = numSent;
	}


	public int getShortest() {
		return shortest;
	}


	public void setShortest(int shortest) {
		this.shortest = shortest;
	}


	public int getLongest() {
		return longest;
	}


	public void setLongest(int longest) {
		this.longest = longest;
	}


	public int getAverage() {
		return average;
	}


	public void setAverage(int average) {
		this.average = average;
	}


	public BufferedWriter getWriter() {
		return writer;
	}


	public void setWriter(BufferedWriter writer) {
		this.writer = writer;
	}



	BufferedWriter writer;

	public void writeStats(int word, int numSent, int shortest, int longest, int average) throws IOException {
		try {
			File file = new File("C:\\Users\\S528805\\Desktop\\java\\jaffa.txt");
			file.createNewFile();

			writer = new BufferedWriter(new FileWriter(file));

			writer.write("Number of words: " + word);
			writer.newLine();
			writer.write("Number of sentences: " + numSent);
			writer.newLine();
			writer.write("Shortest sentence: " + shortest + " words");
			writer.newLine();
			writer.write("Longest sentence: " + longest + " words");
			writer.newLine();
			writer.write("Average sentence: " + average + " words");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("something messed up");
			System.exit(1);
		} finally {
			writer.close();
		}

	}
	public static void main(String args[]) {
		
		int a = 13;
		int b = 3;
		int c = 12;
		int d = 6;
		int e = 7;
		
		BufferedWritingToFile bfw = new BufferedWritingToFile();
		bfw.setWord(a);
		bfw.setShortest(b);
		bfw.setNumSent(c);
		bfw.setLongest(d);
		bfw.setAverage(e);
		try {
			bfw.writeStats(a, c, b, d, e);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
