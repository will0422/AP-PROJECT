import pkg.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;



class starter {
	public static void main(String args[]) throws FileNotFoundException{
		Random rand = new Random();
		Scanner xc = new Scanner(System.in);
		
		int num = rand.nextInt(2499);
		
		File text = new File("./wordlist.txt");
		
		Scanner sc = new Scanner(text);
		
		int lineNumber = 1;
		
		ArrayList <String> words = new ArrayList <String>(2499);
		
        while(sc.hasNextLine()){		
            String line = sc.nextLine();
            words.add(line);
        }
		
		String targword = words.get(num);
		words.remove(num);
		
		game(targword);
	}
	
	public static int game(String targword){
		
	}
}
