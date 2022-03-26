class stringcollection
{
	public static void main(String args[])
	{
		String phrase="the quick brown for jumped over the lary dog";
		int vowel=0;
		for(char ch:phrase.toCharArray())
		{
			ch=Character.toLowerCase(ch);
			if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
			{
				++vowel;
			}
			System.out.println("the phrase contains "+vowel+" vowel");
		}
	}
}