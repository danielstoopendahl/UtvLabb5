package utvLabb5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class RandSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(args[0]);
		LinkedList<Integer> list = new LinkedList<Integer>();
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(args[1]));
			writer.write("Nr, Time");
			
			while(s.hasNext()) {
				list.add(Integer.parseInt(s.nextLine()));				
			}
			
			LinkedList<Integer> newlist = new LinkedList<Integer>();
			for(int i = 0; i < Integer.parseInt(args[2]); i++) {
				
				for(int n: list) {
					newlist.add(n);
				}
				long t0 = System.nanoTime();
				Collections.sort(newlist);
				long t1 = System.nanoTime();
				
				writer.write(i + ", " + (t1-t0));
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
		}
		
	
		
		
		
	}
	
	
}
