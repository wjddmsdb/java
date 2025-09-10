package cote.exam2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] strs = input.split(" ");
		
		int num = Integer.parseInt(strs[0]);
		
		scanner.close();
		if(num %4==0 && num%100!=0)
	    {
	        System.out.println("1");
	    }
	    else if(num %400==0)
	    {
	        System.out.println("1");
	    }
	    else
	    {
	        System.out.println("0");
	    }
	}

}
