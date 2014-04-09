
public class ReplaceSpacesInStr 
{
	/*
	* Write a method to replace all spaces in a string with Ô%20Õ.
	*/
	
	public static void main(String args[])
	{
		char[] send = new char[7];
		char[] receive, receive2;
		send[0] = 'a';
		send[1] = ' ';
		send[2] = 'b';
		send[3] = ' ';
		send[4] = 'c';
		send[5] = 'd';
		send[6] = ' ';
 		receive = replace(send);
 		//receive2 = replaceFun(send, 7);
		for(int i=0; i<receive.length; i++)
			System.out.print(receive[i]);
	}
	
	//Good Solution
	public static char[] replace(char[] str)
	{
		int space = 0;
		for(int i=0; i<str.length; i++)
		{
			if(str[i] == ' ')
				++space;
		}
		char[] arr = new char[str.length + (space*2)];
		System.out.println(arr.length);
		int index = 0;
		for(int i=0; i<str.length; i++)
		{
			
			if(str[i] != ' ')
				arr[index++] = str[i];
			else
			{
				arr[index] = '%';
				arr[index+1] = '2';
				arr[index+2] = '0';
				index = index + 3;
			}	
		}
		return arr;
	}
	
	//Better Solution
	public static char[] replaceFun(char[] str, int length) {
		 int spaceCount = 0, newLength, i = 0;
		 for (i = 0; i < length; i++) 
		 {
			 if (str[i] == ' ') 
			 {
				 spaceCount++;
			 }
		 }
		 newLength = length + spaceCount * 2;
		 str[newLength] = '\0';
		 System.out.println(newLength);
		 for (i = length - 1; i >= 0; i--) 
		 {
			 if (str[i] == ' ') 
			 {
				 str[newLength - 1] = '0';
				 str[newLength - 2] = '2';
				 str[newLength - 3] = '%';
				 newLength = newLength - 3;
			 } 
			 else 
			 {
				 str[newLength - 1] = str[i];
				 newLength = newLength - 1;
			 }
		 }
		 return str;
	}
}
