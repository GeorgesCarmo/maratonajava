package Fregex;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		String texto = "Levi,Eren,Mikasa,true,200";
		Scanner scan = new Scanner(texto);
		scan.useDelimiter(",");
		while(scan.hasNext()) {
			if(scan.hasNextInt()) {
				int i = scan.nextInt();
				System.out.println("int "+i);
			}else if(scan.hasNextBoolean()) {
				Boolean b = scan.nextBoolean();
				System.out.println("Boolean "+b);
			}else {
				System.out.println(scan.next());
			}
		}
		
		
		}
	}
