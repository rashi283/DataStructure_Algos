import java.util.ArrayList;


public class ArrayList_Example 
{
	public static void main(String args[])
	{
		String[] words = new String[2];//= {"words", "more"};
		String[] more = new String[2];//= {"some", "again"};
		ArrayList<String> str = new ArrayList<String>();
		for(int i=0; i<words.length; i++)
			words[i] = "words" + i;
		for(int i=0; i<more.length; i++)
			more[i] = "more" + i;
		str = merge(words, more);
		System.out.println(str);
		
	}
	public static ArrayList<String> merge (String[] words, String[] more)
	{
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w : words)
			sentence.add(w);
		for(String w : more)
			sentence.add(w);
		return sentence;
	}
}
