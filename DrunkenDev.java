import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class DrunkenDev{
	private static final String[] TYPES = {"int", "short", "long", "byte", "float", "double", "char", "boolean"};
	private static final String[] LOREM = getLorem();

	public static void main(String...args){
		CustomSyntax ifState1 = new CustomSyntax();
		ifState1.
			setStatement("if").
			setCondition("" + randomChar('a','z') +  " < " + randomChar('a','z')).
			setBlock(TYPES[2] + randomName(LOREM) + " = " + randomInt(0,1000));
		
		
		System.out.println(ifState1);
	}
	
	public static String generateSyntax(String type, String statement, String condition, ){}
	
	public static int randomInt(int from, int to){
		return (int)(Math.random()*(to - from) + from);
	}
	
	public static char randomChar(char from, char to){
		return (char)randomInt((int)from, (int)to);
	}
	
	public static String randomName(String[] list){
		CharSequence forbiddenChars = ".,()!#¤%";
	
		String tempWord = list[(int)(Math.random() * list.length)];
		
		return " " + tempWord;
	}
	
	// done
	public static String[] getLorem(){
		CharSequence forbiddenChars = ".,()!#¤%";
		ArrayList<String> list = new ArrayList<String>();
	
		try{
			Scanner scan = new Scanner(new File("lorem.txt"));
			
			while(scan.hasNext()){
				String temp = scan.next();
				
				if(temp.length() > 3){
					temp = temp.substring(0, temp.length() - 1);
					list.add(temp);
				}
			}
		}catch(Exception e){}
		
		return list.toArray(new String[list.size()]);
	}
}
