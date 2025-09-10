package cote.exam14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		
		int x = Integer.parseInt(first);
		int y = Integer.parseInt(second);
		
		scanner.close();
		if (x>0 && y>0)
	    {
	        System.out.println("1");
	    }
	    else if (x<0 && y>0)
	    {
	        System.out.println("2");
	    }
	    else if (x<0 && y<0)
	    {
	        System.out.println("3");
	    }
	    else
	    {
	        System.out.println("4");
	    }
	}

}
