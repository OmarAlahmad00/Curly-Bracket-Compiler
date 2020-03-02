	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	
	public class compileErrors {
	
		public static void main(String[] args) throws FileNotFoundException {
			
			int hello = 1;
			int bye = 2;
			
			System.out.println(hello&bye);
			
			checkForErrors();
			
		}
		
		
		public static void checkForErrors() throws FileNotFoundException {
	
			File file = new File("C:/Users/omara.DESKTOP-2FGUV6O/eclipse-workspace/Improved_One/src/code.txt");
			Scanner scanner =  new Scanner(file);
			String word;
			int curlyOpenAmn = 0;
			int curlyCloseAmn = 0;
			int missingOpening = 0;
			int missingClosing = 0;
			int closeBeforeOpen = 0;
			char lastCharacter = ' ';
			while(scanner.hasNext()) {
				
				
				word = scanner.next();
				
				for(int x = 0; x < word.length(); x++) {
				if(word.charAt(x) == '{') {
				curlyOpenAmn++;
				if(curlyOpenAmn <= curlyCloseAmn && lastCharacter == '}') {
					missingClosing++;
				} else if(scanner.hasNext() == false && x + 1 == word.length() && curlyOpenAmn > curlyCloseAmn) {
					missingClosing++;
				}
				lastCharacter = '{';
				} else if(word.charAt(x) == '}') {
					
					curlyCloseAmn++;
					if(curlyCloseAmn > curlyOpenAmn && lastCharacter != '{') {
						missingOpening++;
					} else if(curlyCloseAmn > curlyOpenAmn && lastCharacter == '}') {
						missingOpening++;
					} else if(scanner.hasNext() == false && x + 1 == word.length() && curlyCloseAmn < curlyOpenAmn) {
						missingOpening++;
					}
					lastCharacter = '}';
				}
				
				
			}
				
			
		}

			
			System.out.println("Amount of Open Curly Brackets: " + curlyOpenAmn);
			System.out.println("Amount of Closing Curly Brackers: " + curlyCloseAmn);
			System.out.println("\nAmount of Missing Closing Curly Brackets: " + missingClosing);
			System.out.println("Amount of missing Opening Curly Brackets: " + missingOpening);
	}
	}