import java.util.*;

public class assignment{
	public static void main (String[] args){
		System.out.println("how many letters is your name");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		char[] location = new char[number];
		System.out.println("what is your name");
		Scanner name = new Scanner(System.in);
		String sname = name.nextLine();
		for(int a = 0; a < location.length; a++){
			location[a] = sname.charAt(a);
		}
		System.out.println("Your name is ");
		for(int b = 0; b < number; b++){
			System.out.print(location[b]);
			System.out.println();
		}

	}
}