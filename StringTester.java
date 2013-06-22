public class StringTester
{
	public static void main(String[] args)
	{

		String greeting="Hello, How are you doing today?";

		System.out.println(greeting);

		System.out.println(greeting.length());

		System.out.println(greeting.toUpperCase());

		System.out.println(greeting.replace("Hello","Bonjour"));


		for(int i=0; i<greeting.length(); i++)
		{
			System.out.println(greeting.charAt(i));
		}



	}
}
