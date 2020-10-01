import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException //A class that will crash the program if the filenotfoundexception is true.
	{		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat")); //searching the user directory and furthermore into the source folder & the input.dat file and taking it all in with Scanner.
		while(input.hasNext()) 
		{
			BibleBook a = new BibleBook(input.nextLine());
			a.display();
		}
		input.close();
		
	}
}


